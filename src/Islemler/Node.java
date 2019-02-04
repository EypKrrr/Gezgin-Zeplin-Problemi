package Islemler;

import java.util.ArrayList;

public class Node {

	String name;
	double lat;
	double lang;
	int attitude;
	int k_sayisi;
	ArrayList<Node> komsular = new ArrayList<Node>();
	ArrayList<Integer> k_mesafe = new ArrayList<Integer>();
	ArrayList<Integer> k_max_aci = new ArrayList<Integer>();
	
	public Node(String a,double b,double c,int d)
	{
		name=a;
		lat=b;
		lang=c;
		attitude=d;
		k_sayisi=0;
	}
	
	public void komsu_ekle(Node a)
	{
		komsular.add(a);
		k_sayisi++;
	}
	
	public void mesafe_ekle(int a)
	{
		k_mesafe.add(a);
	}
	
	public void aci_ekle(int a)
	{
		k_max_aci.add(a);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLat()
	{
		return lat;
	}
	
	public double getLong() 
	{
		return lang;
	}
	
	public int getAttitude()
	{
		return attitude;
	}
	
	public int getKsayisi()
	{
		return k_sayisi;
	}
	
	public void setKsayisi(int a)
	{
		k_sayisi=a;
	}
	
	public int komsu_mu(Node a)
	{
		for(int i=0;i<k_sayisi;i++)
		{
			if(komsular.get(i).getName().equals(a.name))
					{
				return i;
					}
		}
		return -1;
	}
	
}