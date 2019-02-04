package Islemler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Graf {

	Node sehirler[] = new Node[81];
	public int sonsuz=Integer.MAX_VALUE;
	public Yolcu yolcu[]=new Yolcu[46];
	public Integer SabitUcret[][]=new Integer[46][2];
	public Integer ElliKar[][]=new Integer[46][2];
	public int ucret=2000;
	int maliyet=1;
		public Graf(String bas,String bit)
		{
			for(int i=0;i<46;i++)
			{
				SabitUcret[i][1]= (i+5);
				ElliKar[i][1]= (i+5);
			}
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			Connection con = null;
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcldb","sys as sysdba","123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			
			int syc=0;
			try {
				ps=con.prepareStatement("select * from sys.prolab21_en_boy");
				rs = ps.executeQuery();
				while (rs.next()) {
					
				String str=rs.getString(1);
				double d1=rs.getDouble(2);
				double d2=rs.getDouble(3);
				int i=rs.getInt(4);
				int plk=Integer.parseInt(str);
				plk--;
				sehirler[plk]=new Node(str,d1,d2,i);
				
				
				syc++;
				}
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PreparedStatement pss = null;
			ResultSet rss = null;
			
            try{
            	int sayac=1;
            	while(sayac<82)
            	{
			pss=con.prepareStatement("select komsu from sys.prolab21_komsular where plaka='"+sayac+"'");
			rss = pss.executeQuery();
			while (rss.next()) {
				String kms=rss.getString(1);
				int i2=Integer.parseInt(kms);
				i2--;
				sehirler[(sayac-1)].komsu_ekle(sehirler[i2]);
				
			}
			sayac++;
			rss.close();
        	pss.close();
            	}
            	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
            
			for(int i=0;i<81;i++)
			{
				for(int j=0;j<sehirler[i].k_sayisi;j++)
				 {
				if(sehirler[i].getName().equals(bas))
					{
					 
						 if(sehirler[i].komsular.get(j).name.equals(bit))
						 {
							 
							 int komsu=mesafeHesapla(sehirler[i].lat, sehirler[i].lang , sehirler[i].komsular.get(j).lat , sehirler[i].komsular.get(j).lang);
							 int karsi=sehirler[i].komsular.get(j).attitude-sehirler[i].attitude;
							 int hipo=(int)(Math.sqrt(komsu*komsu+karsi*karsi));
							 int aci=aciHesapla(komsu,karsi);
							 sehirler[i].mesafe_ekle(hipo);
							 sehirler[i].aci_ekle(aci);
							 
						 }else{
							 
							 int komsu=mesafeHesapla(sehirler[i].lat, sehirler[i].lang , sehirler[i].komsular.get(j).lat , sehirler[i].komsular.get(j).lang);
							 int karsi=sehirler[i].komsular.get(j).attitude-(sehirler[i].attitude-50);
							 int hipo=(int)(Math.sqrt(komsu*komsu+karsi*karsi));
							 int aci=aciHesapla(komsu,karsi);
							 sehirler[i].mesafe_ekle(hipo);
							 sehirler[i].aci_ekle(aci);
							 
						 }
					 
					}else{
						
						if(sehirler[i].komsular.get(j).name.equals(bit))
						 {
							
							int komsu=mesafeHesapla(sehirler[i].lat, sehirler[i].lang , sehirler[i].komsular.get(j).lat , sehirler[i].komsular.get(j).lang);
							 int karsi=sehirler[i].komsular.get(j).attitude-(sehirler[i].attitude+50);
							 int hipo=(int)(Math.sqrt(komsu*komsu+karsi*karsi));
							 int aci=aciHesapla(komsu,karsi);
							 sehirler[i].mesafe_ekle(hipo);
							 sehirler[i].aci_ekle(aci);
							
						 }else{
							 
							 int komsu=mesafeHesapla(sehirler[i].lat, sehirler[i].lang , sehirler[i].komsular.get(j).lat , sehirler[i].komsular.get(j).lang);
							 int karsi=sehirler[i].komsular.get(j).attitude-sehirler[i].attitude;
							 int hipo=(int)(Math.sqrt(komsu*komsu+karsi*karsi));
							 int aci=aciHesapla(komsu,karsi);
							 sehirler[i].mesafe_ekle(hipo);
							 sehirler[i].aci_ekle(aci);							 
						 }
						
					}
				 }
			}
			
			
			int [][] en_kisa=new int[82][82];
			
			for(int i=0;i<82;i++)
			{
				en_kisa[0][i]=sonsuz;
				en_kisa[1][i]=sonsuz;
			}
		
			int baslangic=Integer.parseInt(bas);
			en_kisa[1][0]=baslangic;

			for(int i=0;i<82;i++)
			{
				en_kisa[i][baslangic]=0;
			}
			en_kisa[1][0]=baslangic;
			int bts=Integer.parseInt(bit);
			for(int k=5;k<51;k++) //Bu döngü tüm yolcu sayýlarý için ayný iþlemlerin tekrarlanmasý için oluþturulmuþtur
			{
				yolcu[(k-5)]=new Yolcu(k);
				yolcu[(k-5)].rota_ekle(bas);
				
				for(int i=0;i<81;i++)
				{
					int indis=sehirler[baslangic-1].komsu_mu(sehirler[i]);
					
					if(indis!=-1 && sehirler[baslangic-1].k_max_aci.get(indis)<=80-k)
					{
						en_kisa[1][Integer.parseInt(sehirler[baslangic-1].komsular.get(indis).name)]=sehirler[baslangic-1].k_mesafe.get(indis);
						
					}
					
				}
				int geri=0;
			for(int i=2;i<82;i++)
			{
				geri=i;
				int temp[][]=new int[81][2];
				for(int m=0;m<81;m++)
				{
					temp[m][0]=en_kisa[i-1][m+1];
					temp[m][1]=m+1;
				}
				int kiyaslama = 0,siradaki = 0;
				boolean uygun=false;
				
				temp=sirala(temp);
				
				for(int j=0;j<81;j++)
				{
				for(int m=1;m<i;m++)
				{
					if(temp[j][1]==en_kisa[m][0])
					{
						
						uygun=false;
						break;
					}else{
						
						uygun=true;
						
					}
				}
				if(uygun==true)
				{
					kiyaslama=temp[j][0];
					siradaki=temp[j][1];
					en_kisa[i][0]=temp[j][1];
					break;
				}
				}
				if(kiyaslama==sonsuz)
				{
					
					if(en_kisa[i-1][bts]!=sonsuz)
					{
						
						yolcu[(k-5)].setMesafe(en_kisa[i-1][bts]);
					}else{
						
						yolcu[(k-5)].setMesafe(-1);
					}
					break;
				}
				
				for(int j=1;j<82;j++)
				{
					
					int kms=sehirler[siradaki-1].komsu_mu(sehirler[j-1]); //Metoddan eðer komþusuysa indisi döner eðer deðilse -1 döner
					if(kms!=-1) //Eðer komþuysa buraya girer
					{
						
					if((80-k)>=sehirler[siradaki-1].k_max_aci.get(kms)) //Döngüdeki yolcu sayýsýna göre o þehre varabilir mi kontrol eder
					{
						if(kiyaslama+sehirler[siradaki-1].k_mesafe.get(kms)<en_kisa[i-1][j]) //Mesafeyi kýyaslar eðer daha kýsaysa toplamýný matrise atar
						{
							en_kisa[i][j]=kiyaslama+sehirler[siradaki-1].k_mesafe.get(kms);
						}else{
							en_kisa[i][j]=en_kisa[i-1][j];
						}
					}else{
						en_kisa[i][j]=en_kisa[i-1][j];
					}
					}else{
						
						en_kisa[i][j]=en_kisa[i-1][j];
					}
				}

					yolcu[(k-5)].setMesafe(en_kisa[i][bts]);
				
			}
			int stn=bts;

			yolcu[(k-5)].rotaOlustur(en_kisa,stn,geri);
			

			}
			
			
			
			for(int i=0;i<46;i++)
			{
				sabitUcret(i);
				elliKar(i);
			}
			
			SabitUcret=sirala2(SabitUcret);
			ElliKar=sirala2(ElliKar);
			
			
		}
		
		
		public int mesafeHesapla(double lat1, double lng1, double lat2, double lng2) {
		    double dRadyan = 6371000; //metre
		    double dLat = Math.toRadians(lat2-lat1);
		    double dLng = Math.toRadians(lng2-lng1);
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    double dist = dRadyan * c;
	        dist=dist/1000;
		    return Math.abs((int)(dist));
		    }
		
		public int aciHesapla(int ko,int ka)
		{
			double c= Math.sqrt(ka*ka+ko*ko);
			int aci=(int)(Math.round(Math.toDegrees(Math.acos(ko/c))));
			return aci;
		}
	
		public int[][] sirala(int[][] a)
		{
			int temp;
			for(int i=0;i<81;i++)
			{
				for(int j=0;j<80;j++)
				{
					
				if(a[j][0]>a[j+1][0])
				{
					temp=a[j][0];
					a[j][0]=a[j+1][0];
					a[j+1][0]=temp;
					temp=a[j][1];
					a[j][1]=a[j+1][1];
					a[j+1][1]=temp;
				}
					
				}
			}
			
			return a;
		}
		
		public Integer[][] sirala2(Integer [][] a)
		{
			int temp;
			for(int i=0;i<46;i++)
			{
				for(int j=0;j<45;j++)
				{
					
				if(a[j][0]>a[j+1][0])
				{
					temp=a[j][0];
					a[j][0]=a[j+1][0];
					a[j+1][0]=temp;
					temp=a[j][1];
					a[j][1]=a[j+1][1];
					a[j+1][1]=temp;
				}
					
				}
			}
			
			return a;
		}
		public void sabitUcret(int kSayisi){

			if(yolcu[kSayisi].mesafe!=-1){
			SabitUcret[kSayisi][0]=((((kSayisi+5)*ucret-(yolcu[kSayisi].mesafe*maliyet))/(yolcu[kSayisi].mesafe*maliyet))*100);
			}else{
				SabitUcret[kSayisi][0]= sonsuz;
			}
			
		}
		
		public void elliKar(int kSayisi)
		{
			if(yolcu[kSayisi].mesafe!=-1){
			ElliKar[kSayisi][0]= (3/2*(yolcu[kSayisi].mesafe*maliyet/(kSayisi+5)));
			}else{
				ElliKar[kSayisi][0]= sonsuz;
			}
			
		}
	
}