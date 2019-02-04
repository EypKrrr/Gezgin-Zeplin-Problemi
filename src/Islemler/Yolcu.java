package Islemler;

import java.util.ArrayList;

public class Yolcu {
	
	int yolcu_sayisi;
	int mesafe;
	public int rota_sayisi;
	public ArrayList<String> rota = new ArrayList<String>();
	
	public Yolcu(int a)
	{
		yolcu_sayisi=a;
		mesafe=0;
		rota_sayisi=0;
	}
	
	public void rota_ekle(String a)
	{
		rota.add(a);
		rota_sayisi++;
	}
	
	public void mesafe_ekle(int a)
	{
		mesafe+=a;
	}
	
	public void setMesafe(int a)
	{
		mesafe=a;
	}
	
	public void rotaOlustur(int [][] dizi,int hedef,int son)
	{
		for(int i=son-1;i>2;i--)
		{
			int temp=i-1;
			if(dizi[i][hedef]!=dizi[temp][hedef])
			{
				hedef=dizi[i][0];
				rotaOlustur(dizi,hedef,i);
				rota_ekle(""+dizi[i][0]);
				break;

			}
		}
	}
	
}