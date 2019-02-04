//Eyup KORURER 150202017

package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Islemler.Graf;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Giris extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris frame = new Giris();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Giris() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10, 0, 1941, 1040);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBaslangic = new JLabel("Ba\u015Flang\u0131\u00E7 \u015Eehrini Giriniz");
		lblBaslangic.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBaslangic.setBounds(92, 78, 217, 44);
		contentPane.add(lblBaslangic);
		
		JComboBox cmbBaslangic = new JComboBox();
		cmbBaslangic.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbBaslangic.setModel(new DefaultComboBoxModel(new String[] {"\u015Eehri Se\u00E7iniz!", "01 Adana", "02 Ad\u0131yaman", "03 Afyon", "04 A\u011Fr\u0131", "05 Amasya", "06 Ankara", "07 Antalya", "08 Artvin", "09 Ayd\u0131n", "10 Bal\u0131kesir", "11 Bilecik", "12 Bing\u00F6l", "13 Bitlis", "14 Bolu", "15 Burdur", "16 Bursa", "17 \u00C7anakkale", "18 \u00C7ank\u0131r\u0131", "19 \u00C7orum", "20 Denizli", "21 Diyarbak\u0131r", "22 Edirne", "23 Elaz\u0131\u011F", "24 Erzincan", "25 Erzurum", "26 Eski\u015Fehir", "27 Gaziantep", "28 Giresun", "29 G\u00FCm\u00FC\u015Fhane", "30 Hakkari", "31 Hatay", "32 Isparta", "33 \u0130\u00E7el (Mersin)", "34 \u0130stanbul", "35 \u0130zmir", "36 Kars", "37 Kastamonu", "38 Kayseri", "39 K\u0131rklareli", "40 K\u0131r\u015Fehir", "41 Kocaeli", "42 Konya", "43 K\u00FCtahya", "44 Malatya", "45 Manisa", "46 K.mara\u015F", "47 Mardin", "48 Mu\u011Fla", "49 Mu\u015F", "50 Nev\u015Fehir", "51 Ni\u011Fde", "52 Ordu", "53 Rize", "54 Sakarya", "55 Samsun", "56 Siirt", "57 Sinop", "58 Sivas", "59 Tekirda\u011F", "60 Tokat", "61 Trabzon", "62 Tunceli", "63 \u015Eanl\u0131urfa", "64 U\u015Fak", "65 Van", "66 Yozgat", "67 Zonguldak", "68 Aksaray", "69 Bayburt", "70 Karaman", "71 K\u0131r\u0131kkale", "72 Batman", "73 \u015E\u0131rnak", "74 Bart\u0131n", "75 Ardahan", "76 I\u011Fd\u0131r", "77 Yalova", "78 Karab\u00FCk", "79 Kilis", "80 Osmaniye", "81 D\u00FCzce"}));
		cmbBaslangic.setBounds(92, 135, 266, 31);
		contentPane.add(cmbBaslangic);
		
		JLabel lblBitis = new JLabel("Biti\u015F \u015Eehrini Giriniz");
		lblBitis.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBitis.setBounds(92, 192, 266, 44);
		contentPane.add(lblBitis);
		
		JComboBox cmbBitis = new JComboBox();
		cmbBitis.setModel(new DefaultComboBoxModel(new String[] {"\u015Eehri Se\u00E7iniz!", "01 Adana", "02 Ad\u0131yaman", "03 Afyon", "04 A\u011Fr\u0131", "05 Amasya", "06 Ankara", "07 Antalya", "08 Artvin", "09 Ayd\u0131n", "10 Bal\u0131kesir", "11 Bilecik", "12 Bing\u00F6l", "13 Bitlis", "14 Bolu", "15 Burdur", "16 Bursa", "17 \u00C7anakkale", "18 \u00C7ank\u0131r\u0131", "19 \u00C7orum", "20 Denizli", "21 Diyarbak\u0131r", "22 Edirne", "23 Elaz\u0131\u011F", "24 Erzincan", "25 Erzurum", "26 Eski\u015Fehir", "27 Gaziantep", "28 Giresun", "29 G\u00FCm\u00FC\u015Fhane", "30 Hakkari", "31 Hatay", "32 Isparta", "33 \u0130\u00E7el (Mersin)", "34 \u0130stanbul", "35 \u0130zmir", "36 Kars", "37 Kastamonu", "38 Kayseri", "39 K\u0131rklareli", "40 K\u0131r\u015Fehir", "41 Kocaeli", "42 Konya", "43 K\u00FCtahya", "44 Malatya", "45 Manisa", "46 K.mara\u015F", "47 Mardin", "48 Mu\u011Fla", "49 Mu\u015F", "50 Nev\u015Fehir", "51 Ni\u011Fde", "52 Ordu", "53 Rize", "54 Sakarya", "55 Samsun", "56 Siirt", "57 Sinop", "58 Sivas", "59 Tekirda\u011F", "60 Tokat", "61 Trabzon", "62 Tunceli", "63 \u015Eanl\u0131urfa", "64 U\u015Fak", "65 Van", "66 Yozgat", "67 Zonguldak", "68 Aksaray", "69 Bayburt", "70 Karaman", "71 K\u0131r\u0131kkale", "72 Batman", "73 \u015E\u0131rnak", "74 Bart\u0131n", "75 Ardahan", "76 I\u011Fd\u0131r", "77 Yalova", "78 Karab\u00FCk", "79 Kilis", "80 Osmaniye", "81 D\u00FCzce"}));
		cmbBitis.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbBitis.setBounds(92, 249, 266, 31);
		contentPane.add(cmbBitis);
		
		JLabel lblProblem = new JLabel("Problemi Giriniz");
		lblProblem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProblem.setBounds(92, 308, 199, 44);
		contentPane.add(lblProblem);
		
		JComboBox cmbProblem = new JComboBox();
		cmbProblem.setModel(new DefaultComboBoxModel(new String[] {"Problemi Se\u00E7iniz!", "Sabit \u00FCcrele maximum kar", "%50 kar i\u00E7in gerekli \u00FCcret"}));
		cmbProblem.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbProblem.setBounds(92, 365, 266, 31);
		contentPane.add(cmbProblem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 507, 349, 462);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(389, 39, 1534, 930);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("<html><img src=\"http://cografyaharita.com/haritalarim/4jdilsiz_turkiye_haritasi_sil.png\" </html>");
		lblNewLabel_2.setBounds(247, 160, 1275, 581);
		panel.add(lblNewLabel_2);
		
		JPanel pnlRota = new JPanel();
		pnlRota.setBounds(12, 13, 216, 904);
		panel.add(pnlRota);
		pnlRota.setLayout(null);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				panel_1.removeAll();
				
				int bas_secim=cmbBaslangic.getSelectedIndex();
				int bit_secim=cmbBitis.getSelectedIndex();
				int pro_secim=cmbProblem.getSelectedIndex();
				if(bas_secim==0)
				{
					JOptionPane.showMessageDialog(null,"Baþlangýç þehrini giriniz!");
					return;
					
				}else
				{
					
					if(bit_secim==0)
					{
						
						JOptionPane.showMessageDialog(null,"Bitiþ þehrini giriniz!");
						return;
					
					}else
					{
						
						if(bas_secim==bit_secim)
						{
							
							JOptionPane.showMessageDialog(null,"Baþlangýç þehri ile bitiþ þehri ayný olamaz!");
							return;
							
						}else{
							if(pro_secim==0)
							{
								JOptionPane.showMessageDialog(null,"Problemi Seçiniz!");
								return;
							}else {
								Graf g=new Graf(""+bas_secim,""+bit_secim);
							if(pro_secim==1){			
								panel_1.removeAll();
								pnlRota.removeAll();
								
								JLabel lblNewLabel = new JLabel("Ki\u015Fi Say\u0131s\u0131:");
								lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblNewLabel.setBounds(35, 47, 87, 24);
								panel_1.add(lblNewLabel);
								
								JLabel lblAlnancret = new JLabel("Al\u0131nan \u00DCcret:");
								lblAlnancret.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblAlnancret.setBounds(35, 84, 87, 24);
								panel_1.add(lblAlnancret);
								
								JLabel lblKarrrrr = new JLabel("Kar:");
								lblKarrrrr.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKarrrrr.setBounds(35, 121, 87, 24);
								panel_1.add(lblKarrrrr);
								
								JLabel lblKisi = new JLabel(""+g.SabitUcret[0][1]);
								lblKisi.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKisi.setBounds(147, 51, 154, 24);
								panel_1.add(lblKisi);
								
								JLabel lblUcret = new JLabel(g.ucret+"TL");
								lblUcret.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblUcret.setBounds(147, 88, 154, 24);
								panel_1.add(lblUcret);
								
								JLabel lblKar = new JLabel("%"+g.SabitUcret[0][0]);
								lblKar.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKar.setBounds(147, 125, 154, 24);
								panel_1.add(lblKar);
								
								int sayac=0;
								while(sayac<(g.yolcu[(g.SabitUcret[0][1]-5)].rota_sayisi-1))
								{
									JLabel label = new JLabel(""+g.yolcu[(g.SabitUcret[0][1]-5)].rota.get(sayac));
									label.setFont(new Font("Tahoma", Font.BOLD, 13));
									label.setBounds(12, 13+(sayac*37), 18, 24);
									pnlRota.add(label);
									
									JLabel label_1 = new JLabel("-->");
									label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
									label_1.setBounds(42, 13+(sayac*37), 33, 24);
									pnlRota.add(label_1);
									
									JLabel label_2 = new JLabel(""+g.yolcu[(g.SabitUcret[0][1]-5)].rota.get(sayac+1));
									label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
									label_2.setBounds(87, 13+(sayac*37), 25, 24);
									pnlRota.add(label_2);
									
									sayac++;
								}
								JLabel label = new JLabel(""+g.yolcu[(g.SabitUcret[0][1]-5)].rota.get(sayac));
								label.setFont(new Font("Tahoma", Font.BOLD, 13));
								label.setBounds(12, 13+(sayac*37), 18, 24);
								pnlRota.add(label);
								
								JLabel label_1 = new JLabel("-->");
								label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
								label_1.setBounds(42, 13+(sayac*37), 33, 24);
								pnlRota.add(label_1);
								
								JLabel label_2 = new JLabel(""+bit_secim);
								label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
								label_2.setBounds(87, 13+(sayac*37), 25, 24);
								pnlRota.add(label_2);
								
								pnlRota.repaint();
								pnlRota.revalidate();
								
								panel_1.repaint();
								panel_1.revalidate();
								
							}else if(pro_secim==2)
							{
								panel_1.removeAll();
								
								JComboBox cmbSayi = new JComboBox();
								cmbSayi.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
								cmbSayi.setFont(new Font("Tahoma", Font.BOLD, 15));
								cmbSayi.setBounds(64, 107, 266, 31);
								panel_1.add(cmbSayi);
								
								JLabel lblNewLabel_1 = new JLabel("Ki\u015Fi say\u0131s\u0131n\u0131 Se\u00E7iniz!");
								lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblNewLabel_1.setBounds(64, 67, 199, 27);
								panel_1.add(lblNewLabel_1);
								
								JLabel lblNewLabel = new JLabel("Ki\u015Fi Say\u0131s\u0131:");
								lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblNewLabel.setBounds(64, 214, 87, 24);
								panel_1.add(lblNewLabel);
								
								JLabel lblAlnancret = new JLabel("Al\u0131nan \u00DCcret:");
								lblAlnancret.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblAlnancret.setBounds(64, 249, 87, 24);
								panel_1.add(lblAlnancret);
								
								JLabel lblKarrrrr = new JLabel("Kar:");
								lblKarrrrr.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKarrrrr.setBounds(64, 284, 87, 24);
								panel_1.add(lblKarrrrr);
								
								JLabel lblUcret = new JLabel(g.ElliKar[0][0]+"TL");
								lblUcret.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblUcret.setBounds(176, 249, 154, 24);
								panel_1.add(lblUcret);
								
								JLabel lblKar = new JLabel("%50");
								lblKar.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKar.setBounds(176, 284, 154, 24);
								panel_1.add(lblKar);
								
								JLabel lblKisi = new JLabel("5");
								lblKisi.setFont(new Font("Tahoma", Font.BOLD, 13));
								lblKisi.setBounds(176, 214, 154, 24);
								panel_1.add(lblKisi);
								
								int sayac=0;
								while(sayac<(g.yolcu[(g.ElliKar[0][1]-5)].rota_sayisi-1))
								{
									JLabel label = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac));
									label.setFont(new Font("Tahoma", Font.BOLD, 13));
									label.setBounds(12, 13+(sayac*37), 18, 24);
									pnlRota.add(label);
									
									JLabel label_1 = new JLabel("-->");
									label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
									label_1.setBounds(42, 13+(sayac*37), 33, 24);
									pnlRota.add(label_1);
									
									JLabel label_2 = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac+1));
									label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
									label_2.setBounds(87, 13+(sayac*37), 25, 24);
									pnlRota.add(label_2);
									
									sayac++;
								}
								JLabel label = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac));
								label.setFont(new Font("Tahoma", Font.BOLD, 13));
								label.setBounds(12, 13+(sayac*37), 18, 24);
								pnlRota.add(label);
								
								JLabel label_1 = new JLabel("-->");
								label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
								label_1.setBounds(42, 13+(sayac*37), 33, 24);
								pnlRota.add(label_1);
								
								JLabel label_2 = new JLabel(""+bit_secim);
								label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
								label_2.setBounds(87, 13+(sayac*37), 25, 24);
								pnlRota.add(label_2);
								
								pnlRota.repaint();
								pnlRota.revalidate();
								
								panel_1.repaint();
								panel_1.revalidate();
								
								JButton btnNewButton_1 = new JButton("G\u00F6ster");
								btnNewButton_1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										int sehir_secim=cmbSayi.getSelectedIndex();
										if(g.ElliKar[sehir_secim][0]!=g.sonsuz)
										{
										lblUcret.setText(g.ElliKar[sehir_secim][0]+"TL");
										lblKisi.setText(""+(sehir_secim+5));
										
										int sayac=0;
										while(sayac<(g.yolcu[(g.ElliKar[0][1]-5)].rota_sayisi-1))
										{
											JLabel label = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac));
											label.setFont(new Font("Tahoma", Font.BOLD, 13));
											label.setBounds(12, 13+(sayac*37), 18, 24);
											pnlRota.add(label);
											
											JLabel label_1 = new JLabel("-->");
											label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
											label_1.setBounds(42, 13+(sayac*37), 33, 24);
											pnlRota.add(label_1);
											
											JLabel label_2 = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac+1));
											label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
											label_2.setBounds(87, 13+(sayac*37), 25, 24);
											pnlRota.add(label_2);
											
											sayac++;
										}
										JLabel label = new JLabel(""+g.yolcu[(g.ElliKar[0][1]-5)].rota.get(sayac));
										label.setFont(new Font("Tahoma", Font.BOLD, 13));
										label.setBounds(12, 13+(sayac*37), 18, 24);
										pnlRota.add(label);
										
										JLabel label_1 = new JLabel("-->");
										label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										label_1.setBounds(42, 13+(sayac*37), 33, 24);
										pnlRota.add(label_1);
										
										JLabel label_2 = new JLabel(""+bit_secim);
										label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
										label_2.setBounds(87, 13+(sayac*37), 25, 24);
										pnlRota.add(label_2);
										
										pnlRota.repaint();
										pnlRota.revalidate();
										
										panel_1.repaint();
										panel_1.revalidate();
										}else{
											JOptionPane.showMessageDialog(null,"Bu yolcu sayýsýyla hedef þehre varýlmasý mümkün deðil!");
										}
										
									}
								});
								btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
								btnNewButton_1.setBounds(118, 171, 97, 25);
								panel_1.add(btnNewButton_1);
								
								
								
								panel_1.repaint();
								panel_1.revalidate();
								
							}
							}
						}
					}
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(92, 450, 199, 31);
		contentPane.add(btnNewButton);
		
		


	}
}