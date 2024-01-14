import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.text.ParseException;
import java.io.*;
import java.util.ArrayList;
public class Main {
	static Scanner in = new Scanner(System.in);
	private static String emri;
	private static String mbiemri;
	public static void main(String[] args) throws Exception {
		
		ArrayList<Drejtues>          arrli1 = new ArrayList<Drejtues>();
		//Me poshte Staf
		//Departamenti i marrjes se sigurim te prones dhe riskut
		ArrayList<DepProna>          arrli2 = new ArrayList<DepProna>();
		ArrayList<DepShendeti>       arrli3 = new ArrayList<DepShendeti>();
		//Departamenti i marrjes ne siguri per produktet motorike
		ArrayList<DepSigMotorrik>    arrli4 = new ArrayList<DepSigMotorrik>();
		ArrayList<DepBanka>          arrli5 = new ArrayList<DepBanka>();
		//Departamenti I demeve
		ArrayList<DepInvestigim>     arrli6 = new ArrayList<DepInvestigim>();
		//Departamenti I financave
		ArrayList<DepKontabiliteti>  arrli7 = new ArrayList<DepKontabiliteti>();
		ArrayList<DepFinanca>        arrli8 = new ArrayList<DepFinanca>();
		//Departamenti i menaxhimit te riskur dhe IT
		ArrayList<DepRisku>          arrli9 = new ArrayList<DepRisku>();
		ArrayList<DepIT>             arrli10 = new ArrayList<DepIT>();
		//Departamenti juridik
		ArrayList<DepCeshAdmin>      arrli11 = new ArrayList<DepCeshAdmin>();
		ArrayList<DepCeshJuridike>   arrli12 = new ArrayList<DepCeshJuridike>();
		//Departamenti I burimeve njerezore
		ArrayList<DepHR>             arrli13 = new ArrayList<DepHR>();
		ArrayList<DepProtokolli>     arrli14 = new ArrayList<DepProtokolli>();
		ArrayList<DepRecep>          arrli15 = new ArrayList<DepRecep>();
		//
		ArrayList<Agjent_terreni>    arrli16 = new ArrayList<Agjent_terreni>();
		ArrayList<Klient>            arrli17 = new ArrayList<Klient>();
		//Sigurimet
		ArrayList<SigShendetiUdhetim>arrli18 = new ArrayList<SigShendetiUdhetim>();
		ArrayList<SigSigurimimakines>arrli19 = new ArrayList<SigSigurimimakines>();
		ArrayList<SigSigurimiStudentit>arrli20 = new ArrayList<SigSigurimiStudentit>();
		ArrayList<SigSigurimiFemijet>arrli21 = new ArrayList<SigSigurimiFemijet>();
		ArrayList<SigSigurimiPrones> arrli22 = new ArrayList<SigSigurimiPrones>();
		ArrayList<SigSigurimiBiznesit> arrli23 = new ArrayList<SigSigurimiBiznesit>();
		ArrayList<SigSigurimiKufitar> arrli24 = new ArrayList<SigSigurimiKufitar>();
		 
		String emri, mbiemri, ditelindja1, gjinia, email, date1;
		Date ditelindja, datafillimit, datambarimit, datamberitjes;
		int telefon;
		boolean exit = false;
		do
		{
			System.out.println("REGJISTRO \n\n"
					+ "Shtypni 1 per te krijuas Drejtues \n"
					+ "Shtypni 2 per te krijuar Staf \n"
					+ "Shtypni 3 per te krijuar Agjent terreni \n"
					+ "Shtypni 4 per te krijuar Klient \n\n"
					+ "Shtypni 42 per te krijuar nje sigurim te ri \n\n"
					+ "			AFISHO \n\n"		
					+ "			Shtypni 5 per te afishuar Drejtuesit  \n"
					+ "			Shtypni 6 per te afishur Stafin \n"
					+ "			Shtypni 7 per te afishuar Agjentet e terrenit\n"
					+ "			Shtypni 8 per te afishuar Klientet\n"
					+ "			Shtypni 9 per te afishuar Sigurimet\n\n"
					+ "Shtyp 10 per te afishuar sigurimet qe jane ne perfundim \n\n"
					+ "Shtypni 0 per te dale nga programi");
			
			int vlera = in.nextInt();
			switch(vlera) 
			{
			
			case 1:
				System.out.println("Emri juaj:");
				emri = in.next();
				System.out.println("Mbiemri juaj:");
				mbiemri = in.next();
				System.out.println("Ditelindja juaj(dd/MM/yyyy):");
				ditelindja1 = in.next();
				ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
				System.out.println("Gjinia juaj:");
				gjinia = in.next();
				System.out.println("Numeri i telefonit:");
				telefon = in.nextInt();
				System.out.println("Emaili juaj:");
				email = in.next();
				System.out.println("Departamenti:");
				String departamenti = in.next();
				System.out.println("Pozicioni:");
				String pozicioni = in.next();
				System.out.println("ID juaj:");
				int iddr2 = in.nextInt();
				Drejtues d = new Drejtues(emri, mbiemri, ditelindja, gjinia, telefon, email, pozicioni, departamenti, iddr2);
				arrli1.add(d);
				
				break;
				
			case 2:
				System.out.println("Cfare departamenti do te regjistrosh stafin? \n"
						+ "1 per Departamenti i marrjes se sigurim te prones dhe riskut \n"
						+ "2 per Departamenti i marrjes ne siguri per produktet motorike \n"
						+ "3 per Departamenti i demeve \n"
						+ "4 per Departamenti i financave \n"
						+ "5 per Departamenti i menaxhimit te riskur dhe IT \n"
						+ "6 per Departamenti juridik \n"
						+ "7 per Departamenti i burimeve njerezore \n");
				int vlera2 = in.nextInt();
				switch(vlera2)
				{
				case 1:
					System.out.println("1 per Prona \n"
							+ "2 per Shendeti \n");
					int vleradep1 = in.nextInt();
					switch(vleradep1)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimi = in.next();
						System.out.println("Departamenti:");
						String departamentidp = in.next();
						System.out.println("Niveli:");
						String niveli = in.next();
						System.out.println("ID juaj:");
						int iddp = in.nextInt();
						DepProna dp = new DepProna(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidp, niveli, arsimi, iddp);
						arrli2.add(dp);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidsh = in.next();
						System.out.println("Departamenti:");
						String departamentidsh = in.next();
						System.out.println("Niveli:");
						String nivelidsh = in.next();
						System.out.println("Specialiteti:");
						String specialiteti = in.next();
						System.out.println("ID juaj:");
						int iddsh = in.nextInt();
						DepShendeti dsh = new DepShendeti(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidsh, nivelidsh, arsimidsh, specialiteti, iddsh);
						arrli3.add(dsh);
						
						break;
					}break;
				
				case 2:
					System.out.println("1 per Sigurimi motorrik \n"
							+ "2 Marredhenit me bankat \n");
					int vleradep2 = in.nextInt();
					switch(vleradep2)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidsm = in.next();
						System.out.println("Departamenti:");
						String departamentidsm = in.next();
						System.out.println("Niveli:");
						String nivelidsm = in.next();
						System.out.println("ID juaj:");
						int iddsm = in.nextInt();
						DepSigMotorrik dsm = new DepSigMotorrik(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidsm, nivelidsm, arsimidsm, iddsm);
						arrli4.add(dsm);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidb = in.next();
						System.out.println("Departamenti:");
						String departamentidb = in.next();
						System.out.println("Niveli:");
						String nivelidb = in.next();
						System.out.println("ID juaj:");
						int iddb = in.nextInt();
						DepBanka db = new DepBanka(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidb, nivelidb, arsimidb, iddb);
						arrli5.add(db);
						
						break;
						
					}break;
					
				case 3:
					System.out.println("1 Shendeti \n"
							+ "2 Investigimi \n");
					int vleradep3 = in.nextInt();
					switch(vleradep3)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidsh = in.next();
						System.out.println("Departamenti:");
						String departamentidsh = in.next();
						System.out.println("Niveli:");
						String nivelidsh = in.next();
						System.out.println("Specialiteti:");
						String specialiteti = in.next();
						System.out.println("ID juaj:");
						int iddsh = in.nextInt();
						DepShendeti dsh = new DepShendeti(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidsh, nivelidsh, arsimidsh, specialiteti, iddsh);
						arrli3.add(dsh);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidi = in.next();
						System.out.println("Departamenti:");
						String departamentidi = in.next();
						System.out.println("Eksperienca:");
						String eksperienca = in.next();
						System.out.println("ID juaj:");
						int iddi = in.nextInt();
						DepInvestigim di = new DepInvestigim(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidi, eksperienca, arsimidi, iddi);
						arrli6.add(di);
						
						break;	
					}break;
				
				case 4:
					System.out.println("1 Kontabiliteti \n"
							+ "2 Financa \n");
					int vleradep4 = in.nextInt();
					switch(vleradep4)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidk = in.next();
						System.out.println("Departamenti:");
						String departamentidk = in.next();
						System.out.println("Eksperienca:");
						String eksperiencadk = in.next();
						System.out.println("ID juaj:");
						int iddk = in.nextInt();
						DepKontabiliteti dk = new DepKontabiliteti(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidk, arsimidk, eksperiencadk, iddk);
						arrli7.add(dk);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidf = in.next();
						System.out.println("Departamenti:");
						String departamentidf = in.next();
						System.out.println("Eksperienca:");
						String eksperiencadf = in.next();
						System.out.println("ID juaj:");
						int iddf = in.nextInt();
						DepFinanca df = new DepFinanca(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidf, eksperiencadf, arsimidf, iddf);
						arrli8.add(df);
						
						break;	
					}break;
					
				case 5:
					System.out.println("1 Risku \n"
							+ "2 IT \n");
					int vleradep5 = in.nextInt();
					switch(vleradep5)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidr = in.next();
						System.out.println("Departamenti:");
						String departamentidr = in.next();
						System.out.println("Eksperienca:");
						String eksperiencadr = in.next();
						System.out.println("ID juaj:");
						int iddr = in.nextInt();
						DepRisku dr2 = new DepRisku(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidr, arsimidr, eksperiencadr, iddr);
						arrli9.add(dr2);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidit = in.next();
						System.out.println("Dega:");
						String dega = in.next();
						System.out.println("Departamenti:");
						String departamentidit = in.next();
						System.out.println("Eksperienca:");
						String eksperiencadit = in.next();
						System.out.println("ID juaj:");
						int iddit = in.nextInt();
						DepIT dit = new DepIT(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidit, eksperiencadit, arsimidit, dega, iddit);
						arrli10.add(dit);
						
						break;	
					}break;	
					
				case 6:
					System.out.println("1 Ceshtjet administrative \n"
							+ "2 Ceshtjet juridike \n");
					int vleradep6 = in.nextInt();
					switch(vleradep6)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidca = in.next();
						System.out.println("Departamenti:");
						String departamentidca = in.next();
						System.out.println("Dega:");
						String degadca = in.next();
						System.out.println("ID juaj:");
						int iddca = in.nextInt();
						DepCeshAdmin dca = new DepCeshAdmin(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidca, arsimidca, degadca, iddca);
						arrli11.add(dca);
						
						break;
					
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidcj = in.next();
						System.out.println("Dega:");
						String degadcj = in.next();
						System.out.println("Departamenti:");
						String departamentidcj = in.next();
						System.out.println("ID juaj:");
						int iddcj = in.nextInt();
						DepCeshJuridike dcj = new DepCeshJuridike(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidcj, arsimidcj, degadcj, iddcj);
						arrli12.add(dcj);
						
						break;	
					}break;	
					
				case 7:
					System.out.println("1 Burimet njerezore HR \n"
							+ "2 Protokolli \n"
							+ "3 Recepsioni");
					int vleradep7 = in.nextInt();
					switch(vleradep7)
					{
					case 1:
						System.out.println("Jeni duke regjistruar nje staf ne Departamentin e Burimeve njerezore - HR \n");
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidhr = in.next();
						System.out.println("Departamenti:");
						String departamentidhr = in.next();
						System.out.println("ID juaj:");
						int iddhr = in.nextInt();
						DepHR dhr = new DepHR(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidhr, arsimidhr, iddhr);
						arrli13.add(dhr);
						
						break;
					
					case 2:
						System.out.println("Jeni duke regjistruar nje staf ne Departamentin e Burimeve njerezore - Protokolli \n");
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidp = in.next();
						System.out.println("Departamenti:");
						String departamentidp = in.next();
						System.out.println("ID juaj:");
						int iddp = in.nextInt();
						DepProtokolli dp = new DepProtokolli(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidp, arsimidp, iddp);
						arrli14.add(dp);
						
						break;
						
					case 3:
						System.out.println("Jeni duke regjistruar nje staf ne Departamentin e Burimeve njerezore - Recepsioni \n");
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Arsimi juaj:");
						String arsimidr = in.next();
						System.out.println("Departamenti:");
						String departamentidr = in.next();
						System.out.println("ID juaj:");
						int iddr = in.nextInt();
						DepRecep dr3 = new DepRecep(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentidr, arsimidr, iddr);
						arrli15.add(dr3);
						
						break;
					}break;
					
				}break;
				
			case 3:
				System.out.println("Emri juaj:");
				emri = in.next();
				System.out.println("Mbiemri juaj:");
				mbiemri = in.next();
				System.out.println("Ditelindja juaj(dd/MM/yyyy):");
				ditelindja1 = in.next();
				ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
				System.out.println("Gjinia juaj:");
				gjinia = in.next();
				System.out.println("Numeri i telefonit:");
				telefon = in.nextInt();
				System.out.println("Emaili juaj:");
				email = in.next();
				System.out.println("Departamenti:");
				String departamentia = in.next();
				System.out.println("Pozicioni:");
				String pozicionia = in.next();
				System.out.println("Qyteti:");
				String qyteti = in.next();
				System.out.println("ID juaj:");
				int ida = in.nextInt();
				Agjent_terreni a = new Agjent_terreni(emri, mbiemri, ditelindja, gjinia, telefon, email, departamentia, pozicionia, qyteti, ida);
				arrli16.add(a);
				
				break;
				
			case 4:
				System.out.println("Emri juaj:");
				emri = in.next();
				System.out.println("Mbiemri juaj:");
				mbiemri = in.next();
				System.out.println("Ditelindja juaj(dd/MM/yyyy):");
				ditelindja1 = in.next();
				ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
				System.out.println("Gjinia juaj:");
				gjinia = in.next();
				System.out.println("Numeri i telefonit:");
				telefon = in.nextInt();
				System.out.println("Emaili juaj:");
				email = in.next();
				System.out.println("Vendlindja:");
				String vendlindja = in.next();
				System.out.println("Qyteti:");
				String qytetik = in.next();
				System.out.println("ID juaj:");
				int idk = in.nextInt();
				Klient k = new Klient(emri, mbiemri, ditelindja, gjinia, telefon, email, vendlindja, qytetik, idk);
				arrli17.add(k);
				System.out.println("Do te merni nje sigurim?: Po/Jo");
				String temp = in.next();
				if(temp.equalsIgnoreCase("Po"))
				{
					System.out.println("Shtypni: \n"
							+ "1 per Sigurimin e shendetit ne udhetim \n"
							+ "2 per Sigurimin e makines \n"
							+ "3 per Sigurimin e studentit(jashte shtetit) \n"
							+ "4 per Sigurimin e femijeve \n"
							+ "5 per Sigurimin e prones \n"
							+ "6 per Sigurimin e biznesit \n"
							+ "7 per Sigurimin kufitar");
					
					int vlerasig = in.nextInt();
					switch(vlerasig)
					{
					case 1:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Zona:");
						String zona = in.next();
						System.out.println("Periudha:");
						String periudha = in.next();
						System.out.println("Data e fillimit:(dd/MM/yyyy)");
						date1  = in.next();
						datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Data e mbarimit:(dd/MM/yyyy)");
						date1  = in.next();
						datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("ID juaj:");
						System.out.println("Atesia:");
						String atesia = in.next();
						System.out.println("Qyteti:");
						String qytetissu = in.next();  
						int idssu = in.nextInt();
						SigShendetiUdhetim ssu = new SigShendetiUdhetim(emri, mbiemri, ditelindja, gjinia, telefon, email, zona, periudha, datafillimit, datambarimit, idssu, atesia, qytetissu);
						arrli18.add(ssu);
						break;
						
					case 2:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Targa:");
						String targa = in.next();
						System.out.println("Shasia:");
						String shasia = in.next();
						System.out.println("Data e fillimit:(dd/MM/yyyy)");
						date1  = in.next();
						datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Data e mbarimit:(dd/MM/yyyy)");
						date1  = in.next();
						datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Atesia:");
						String atesiassm = in.next();
						System.out.println("Qyteti:");
						String qytetissm = in.next();
						System.out.println("Adresa:");
						String adresa = in.next();
						System.out.println("ID juaj:");
						int idssm = in.nextInt();
						SigSigurimimakines ssm = new SigSigurimimakines(emri, mbiemri, ditelindja, gjinia, telefon, email, targa, shasia, datafillimit, datambarimit, idssm, atesiassm, qytetissm, adresa);
						arrli19.add(ssm);
						break;
						
					case 3:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Zona:");
						String zonasss = in.next();
						System.out.println("Periudha:");
						String periudhasss = in.next();
						System.out.println("Data e fillimit:(dd/MM/yyyy)");
						date1  = in.next();
						datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Data e mbarimit:(dd/MM/yyyy)");
						date1  = in.next();
						datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Atesia:");
						String atesiasss = in.next();
						System.out.println("Qyteti:");
						String qytetisss = in.next();
						System.out.println("Adresa:");
						String adresasss = in.next();
						System.out.println("ID juaj:");
						int idsss = in.nextInt();
						SigSigurimiStudentit sss = new SigSigurimiStudentit(emri, mbiemri, ditelindja, gjinia, telefon, email, zonasss, periudhasss, datafillimit, datambarimit, idsss, atesiasss, qytetisss, adresasss);
						arrli20.add(sss);
						break;	
					
					case 4:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Data e fillimit:(dd/MM/yyyy)");
						date1  = in.next();
						datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Data e mbarimit:(dd/MM/yyyy)");
						date1  = in.next();
						datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Atesia:");
						String atesiassf = in.next();
						System.out.println("Qyteti:");
						String qytetissf = in.next();
						System.out.println("Adresa:");
						String adresassf = in.next();
						System.out.println("ID juaj:");
						int idssf = in.nextInt();
						SigSigurimiFemijet ssf = new SigSigurimiFemijet(emri, mbiemri, ditelindja, gjinia, telefon, email, datafillimit, datambarimit, idssf, atesiassf, qytetissf, adresassf);
						arrli21.add(ssf);
						break;	
						
					case 5:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Lloji i prones:");
						String llojiprones = in.next();
						System.out.println("Vlera ne treg:");
						String vleratregut = in.next();
						System.out.println("Siperfaqja:");
						String siperfaqja = in.next();
						System.out.println("Vlera e paisjeve:");
						String vlerapaisjeve = in.next();
						System.out.println("Shuma totale:");
						String shumatotale = in.next();
						System.out.println("Mbulimi:(zjarr, rrufe, termet, permbytje)");
						String mbulimi = in.next();
						System.out.println("Adresa:");
						String adresassp = in.next();
						System.out.println("ID juaj:");
						int idssp = in.nextInt();
						SigSigurimiPrones ssp = new SigSigurimiPrones(emri, mbiemri, ditelindja, gjinia, telefon, email, llojiprones, vleratregut, siperfaqja, vlerapaisjeve, shumatotale, mbulimi, idssp, adresassp);
						arrli22.add(ssp);
						break;		
						
					case 6:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Emri i subjektit:");
						String emrisubjekt = in.next();
						System.out.println("Nipt-i:");
						String nipt = in.next();
						System.out.println("Vlera e nderteses:");
						String vlerandertes = in.next();
						System.out.println("Vlera e makinerive:");
						String vleramakinerive = in.next();
						System.out.println("Vlera e mallit:");
						String vleramallit = in.next();
						System.out.println("Mbulimi:(zjarr, rrufe, termet, permbytje)");
						String mbulimissb = in.next();
						System.out.println("Adresa:");
						String adresassb = in.next();
						System.out.println("ID juaj:");
						int idssb = in.nextInt();
						SigSigurimiBiznesit ssb = new SigSigurimiBiznesit(emri, mbiemri, ditelindja, gjinia, telefon, email, emrisubjekt, nipt, vlerandertes, vleramakinerive, vleramallit, mbulimissb, idssb, adresassb);
						arrli23.add(ssb);
						break;	
						
					case 7:
						System.out.println("Emri juaj:");
						emri = in.next();
						System.out.println("Mbiemri juaj:");
						mbiemri = in.next();
						System.out.println("Ditelindja juaj(dd/MM/yyyy):");
						ditelindja1 = in.next();
						ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
						System.out.println("Gjinia juaj:");
						gjinia = in.next();
						System.out.println("Numeri i telefonit:");
						telefon = in.nextInt();
						System.out.println("Emaili juaj:");
						email = in.next();
						System.out.println("Targa:");
						String targassk = in.next();
						System.out.println("Shasia:");
						String shasiassk = in.next();
						System.out.println("Periudha:");
						String periudhassk = in.next();
						System.out.println("Kategoria:");
						String kategoriassk = in.next();
						System.out.println("Data e fillimit:(dd/MM/yyyy)");
						date1  = in.next();
						datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Data e mbarimit:(dd/MM/yyyy)");
						date1  = in.next();
						datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Pika Kufitare:");
						String pikakufitare = in.next();
						System.out.println("Data e mberitjes(ne piken kufitare):(dd/MM/yyyy)");
						date1  = in.next();
						datamberitjes = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
						System.out.println("Adresa:");
						String adresassk = in.next();
						System.out.println("ID juaj:");
						int idssk = in.nextInt();
						SigSigurimiKufitar ssk = new SigSigurimiKufitar(emri, mbiemri, ditelindja, gjinia, telefon, email, targassk, shasiassk, periudhassk, kategoriassk, datafillimit, datambarimit, idssk, pikakufitare, datamberitjes, adresassk);
						arrli24.add(ssk);
						break;	
						
					}
					
				}
				else if(temp.equalsIgnoreCase("Jo"))
					{
					arrli18.add(null);
					arrli19.add(null);
					arrli20.add(null);
					arrli21.add(null);
					arrli22.add(null);
					arrli23.add(null);
					arrli24.add(null);
					}
				break;	
			
			case 42:
				System.out.println("Shtypni: \n"
						+ "1 per Sigurimin e shendetit ne udhetim \n"
						+ "2 per Sigurimin e makines \n"
						+ "3 per Sigurimin e studentit(jashte shtetit) \n"
						+ "4 per Sigurimin e femijeve \n"
						+ "5 per Sigurimin e prones \n"
						+ "6 per Sigurimin e biznesit \n"
						+ "7 per Sigurimin kufitar");
				
				int vlerasig42 = in.nextInt();
				switch(vlerasig42)
				{
				case 1:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Zona:");
					String zona = in.next();
					System.out.println("Periudha:");
					String periudha = in.next();
					System.out.println("Data e fillimit:(dd/MM/yyyy)");
					date1  = in.next();
					datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Data e mbarimit:(dd/MM/yyyy)");
					date1  = in.next();
					datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("ID juaj:");
					System.out.println("Atesia:");
					String atesia = in.next();
					System.out.println("Qyteti:");
					String qytetissu = in.next();  
					int idssu = in.nextInt();
					SigShendetiUdhetim ssu = new SigShendetiUdhetim(emri, mbiemri, ditelindja, gjinia, telefon, email, zona, periudha, datafillimit, datambarimit, idssu, atesia, qytetissu);
					arrli18.add(ssu);
					break;
					
				case 2:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Targa:");
					String targa = in.next();
					System.out.println("Shasia:");
					String shasia = in.next();
					System.out.println("Data e fillimit:(dd/MM/yyyy)");
					date1  = in.next();
					datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Data e mbarimit:(dd/MM/yyyy)");
					date1  = in.next();
					datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Atesia:");
					String atesiassm = in.next();
					System.out.println("Qyteti:");
					String qytetissm = in.next();
					System.out.println("Adresa:");
					String adresa = in.next();
					System.out.println("ID juaj:");
					int idssm = in.nextInt();
					SigSigurimimakines ssm = new SigSigurimimakines(emri, mbiemri, ditelindja, gjinia, telefon, email, targa, shasia, datafillimit, datambarimit, idssm, atesiassm, qytetissm, adresa);
					arrli19.add(ssm);
					break;
					
				case 3:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Zona:");
					String zonasss = in.next();
					System.out.println("Periudha:");
					String periudhasss = in.next();
					System.out.println("Data e fillimit:(dd/MM/yyyy)");
					date1  = in.next();
					datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Data e mbarimit:(dd/MM/yyyy)");
					date1  = in.next();
					datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Atesia:");
					String atesiasss = in.next();
					System.out.println("Qyteti:");
					String qytetisss = in.next();
					System.out.println("Adresa:");
					String adresasss = in.next();
					System.out.println("ID juaj:");
					int idsss = in.nextInt();
					SigSigurimiStudentit sss = new SigSigurimiStudentit(emri, mbiemri, ditelindja, gjinia, telefon, email, zonasss, periudhasss, datafillimit, datambarimit, idsss, atesiasss, qytetisss, adresasss);
					arrli20.add(sss);
					break;	
				
				case 4:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Data e fillimit:(dd/MM/yyyy)");
					date1  = in.next();
					datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Data e mbarimit:(dd/MM/yyyy)");
					date1  = in.next();
					datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Atesia:");
					String atesiassf = in.next();
					System.out.println("Qyteti:");
					String qytetissf = in.next();
					System.out.println("Adresa:");
					String adresassf = in.next();
					System.out.println("ID juaj:");
					int idssf = in.nextInt();
					SigSigurimiFemijet ssf = new SigSigurimiFemijet(emri, mbiemri, ditelindja, gjinia, telefon, email, datafillimit, datambarimit, idssf, atesiassf, qytetissf, adresassf);
					arrli21.add(ssf);
					break;	
					
				case 5:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Lloji i prones:");
					String llojiprones = in.next();
					System.out.println("Vlera ne treg:");
					String vleratregut = in.next();
					System.out.println("Siperfaqja:");
					String siperfaqja = in.next();
					System.out.println("Vlera e paisjeve:");
					String vlerapaisjeve = in.next();
					System.out.println("Shuma totale:");
					String shumatotale = in.next();
					System.out.println("Mbulimi:(zjarr, rrufe, termet, permbytje)");
					String mbulimi = in.next();
					System.out.println("Adresa:");
					String adresassp = in.next();
					System.out.println("ID juaj:");
					int idssp = in.nextInt();
					SigSigurimiPrones ssp = new SigSigurimiPrones(emri, mbiemri, ditelindja, gjinia, telefon, email, llojiprones, vleratregut, siperfaqja, vlerapaisjeve, shumatotale, mbulimi, idssp, adresassp);
					arrli22.add(ssp);
					break;		
					
				case 6:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Emri i subjektit:");
					String emrisubjekt = in.next();
					System.out.println("Nipt-i:");
					String nipt = in.next();
					System.out.println("Vlera e nderteses:");
					String vlerandertes = in.next();
					System.out.println("Vlera e makinerive:");
					String vleramakinerive = in.next();
					System.out.println("Vlera e mallit:");
					String vleramallit = in.next();
					System.out.println("Mbulimi:(zjarr, rrufe, termet, permbytje)");
					String mbulimissb = in.next();
					System.out.println("Adresa:");
					String adresassb = in.next();
					System.out.println("ID juaj:");
					int idssb = in.nextInt();
					SigSigurimiBiznesit ssb = new SigSigurimiBiznesit(emri, mbiemri, ditelindja, gjinia, telefon, email, emrisubjekt, nipt, vlerandertes, vleramakinerive, vleramallit, mbulimissb, idssb, adresassb);
					arrli23.add(ssb);
					break;	
					
				case 7:
					System.out.println("Emri juaj:");
					emri = in.next();
					System.out.println("Mbiemri juaj:");
					mbiemri = in.next();
					System.out.println("Ditelindja juaj(dd/MM/yyyy):");
					ditelindja1 = in.next();
					ditelindja = new SimpleDateFormat("dd/MM/yyyy").parse(ditelindja1);
					System.out.println("Gjinia juaj:");
					gjinia = in.next();
					System.out.println("Numeri i telefonit:");
					telefon = in.nextInt();
					System.out.println("Emaili juaj:");
					email = in.next();
					System.out.println("Targa:");
					String targassk = in.next();
					System.out.println("Shasia:");
					String shasiassk = in.next();
					System.out.println("Periudha:");
					String periudhassk = in.next();
					System.out.println("Kategoria:");
					String kategoriassk = in.next();
					System.out.println("Data e fillimit:(dd/MM/yyyy)");
					date1  = in.next();
					datafillimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Data e mbarimit:(dd/MM/yyyy)");
					date1  = in.next();
					datambarimit = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Pika Kufitare:");
					String pikakufitare = in.next();
					System.out.println("Data e mberitjes(ne piken kufitare):(dd/MM/yyyy)");
					date1  = in.next();
					datamberitjes = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
					System.out.println("Adresa:");
					String adresassk = in.next();
					System.out.println("ID juaj:");
					int idssk = in.nextInt();
					SigSigurimiKufitar ssk = new SigSigurimiKufitar(emri, mbiemri, ditelindja, gjinia, telefon, email, targassk, shasiassk, periudhassk, kategoriassk, datafillimit, datambarimit, idssk, pikakufitare, datamberitjes, adresassk);
					arrli24.add(ssk);
					break;
				}break;
			case 5:
				listaDrejtues(arrli1);
				break;
				
			case 6:
				listaStaf(arrli2, arrli3, arrli4, arrli5, arrli6, arrli7, arrli8, arrli9, arrli10, arrli11, arrli12, arrli13, arrli14, arrli15);
				break;
				
			case 7:
				listaAgjentTerreni(arrli16);
				break;	
			
			case 8:
				listaKlient(arrli17);
				break;
				
			case 9:
				listaSigurime(arrli18, arrli19, arrli20, arrli21, arrli22, arrli23, arrli24);
				break;
				
			case 10:
				sigurimiMbaron(arrli18, arrli19, arrli20, arrli21, arrli24);
				break;
				
			case 0:
				exit=true;
				break;
				
			}
					
		}while(!exit);
		
	}
	 public static void listaDrejtues(ArrayList<Drejtues> arrli1) {
	        System.out.println("Drejtuesit e rregjistruar:");
	        for (Drejtues drejtues : arrli1) {
	            System.out.println("Emer Mbiemer: " + drejtues.getEmer() + " " + drejtues.getMbiemer() + " | Email: " + drejtues.getEmail() + " | Telefon: " + drejtues.getTelefon());
	        }
	 	}
	
	 public static void listaStaf(ArrayList<DepProna> arrli2, ArrayList<DepShendeti> arrli3, 
			 ArrayList<DepSigMotorrik> arrli4, ArrayList<DepBanka> arrli5, 
			 ArrayList<DepInvestigim> arrli6, 
			 ArrayList<DepKontabiliteti> arrli7, ArrayList<DepFinanca> arrli8, 
			 ArrayList<DepRisku> arrli9, ArrayList<DepIT> arrli10,
			 ArrayList<DepCeshAdmin> arrli11, ArrayList<DepCeshJuridike> arrli12,
			 ArrayList<DepHR> arrli13, ArrayList<DepProtokolli> arrli14, ArrayList<DepRecep> arrli15) {
	        System.out.println("Stafi i rregjistruar:");
	      //Departamenti i marrjes se sigurim te prones dhe riskut
	        for (DepProna staf2 : arrli2) {
	            System.out.println("Emer Mbiemer: " + staf2.getEmer() + " " + staf2.getMbiemer() + " | Email: " + staf2.getEmail() + " | Telefon: " + staf2.getTelefon());
	        }
	        for (DepShendeti staf3 : arrli3) {
		        System.out.println("Emer Mbiemer: " + staf3.getEmer() + " " + staf3.getMbiemer() + " | Email: " + staf3.getEmail() + " | Telefon: " + staf3.getTelefon()); 
	        }
		    for (DepSigMotorrik staf4 : arrli4) {
			    System.out.println("Emer Mbiemer: " + staf4.getEmer() + " " + staf4.getMbiemer() + " | Email: " + staf4.getEmail() + " | Telefon: " + staf4.getTelefon()); 
		    }
			for (DepBanka staf5 : arrli5) {
				System.out.println("Emer Mbiemer: " + staf5.getEmer() + " " + staf5.getMbiemer() + " | Email: " + staf5.getEmail() + " | Telefon: " + staf5.getTelefon());
			}
			for (DepInvestigim staf6 : arrli6) {
				System.out.println("Emer Mbiemer: " + staf6.getEmer() + " " + staf6.getMbiemer() + " | Email: " + staf6.getEmail() + " | Telefon: " + staf6.getTelefon());
			}
			for (DepKontabiliteti staf7 : arrli7) {
				System.out.println("Emer Mbiemer: " + staf7.getEmer() + " " + staf7.getMbiemer() + " | Email: " + staf7.getEmail() + " | Telefon: " + staf7.getTelefon());
			}
			for (DepFinanca staf8 : arrli8) {
				System.out.println("Emer Mbiemer: " + staf8.getEmer() + " " + staf8.getMbiemer() + " | Email: " + staf8.getEmail() + " | Telefon: " + staf8.getTelefon());
			}
			for (DepRisku staf9 : arrli9) {
				System.out.println("Emer Mbiemer: " + staf9.getEmer() + " " + staf9.getMbiemer() + " | Email: " + staf9.getEmail() + " | Telefon: " + staf9.getTelefon());
			}
			for (DepIT staf10 : arrli10) {
			    System.out.println("Emer Mbiemer: " + staf10.getEmer() + " " + staf10.getMbiemer() + " | Email: " + staf10.getEmail() + " | Telefon: " + staf10.getTelefon());
			}
			for (DepCeshAdmin staf11 : arrli11) {
				System.out.println("Emer Mbiemer: " + staf11.getEmer() + " " + staf11.getMbiemer() + " | Email: " + staf11.getEmail() + " | Telefon: " + staf11.getTelefon());
			}
			for (DepCeshJuridike staf12 : arrli12) {
				System.out.println("Emer Mbiemer: " + staf12.getEmer() + " " + staf12.getMbiemer() + " | Email: " + staf12.getEmail() + " | Telefon: " + staf12.getTelefon());
			}
			for (DepHR staf13 : arrli13) {
				System.out.println("Emer Mbiemer: " + staf13.getEmer() + " " + staf13.getMbiemer() + " | Email: " + staf13.getEmail() + " | Telefon: " + staf13.getTelefon());
			}
			for (DepProtokolli staf14 : arrli14) {
			    System.out.println("Emer Mbiemer: " + staf14.getEmer() + " " + staf14.getMbiemer() + " | Email: " + staf14.getEmail() + " | Telefon: " + staf14.getTelefon());
			}
			for (DepRecep staf15 : arrli15) {
				System.out.println("Emer Mbiemer: " + staf15.getEmer() + " " + staf15.getMbiemer() + " | Email: " + staf15.getEmail() + " | Telefon: " + staf15.getTelefon());
			    
	        }
	 	}

	 public static void listaAgjentTerreni(ArrayList<Agjent_terreni> arrli16) {
	        System.out.println("Agjentet e terenit te rregjistruar:");
	        for (Agjent_terreni agjent : arrli16) {
	            System.out.println("Emer Mbiemer: " + agjent.getEmer() + " " + agjent.getMbiemer() + " | Email: " + agjent.getEmail() + " | Telefon: " + agjent.getTelefon() + " | Qyteti: " + agjent.getQyteti());
	        }
	 	}
	 
	 public static void listaKlient(ArrayList<Klient> arrli17) {
	        System.out.println("Klientet e rregjistruar:");
	        for (Klient klient : arrli17) {
	            System.out.println("Emer Mbiemer: " + klient.getEmer() + " " + klient.getMbiemer() + " | Email: " + klient.getEmail() + " | Telefon: " + klient.getTelefon() + " | Qyteti: " + klient.getQytetik());
	        }
	 	}

	 public static void listaSigurime(ArrayList<SigShendetiUdhetim> arrli18,
			 ArrayList<SigSigurimimakines> arrli19, ArrayList<SigSigurimiStudentit> arrli20, ArrayList<SigSigurimiFemijet> arrli21,
			 ArrayList<SigSigurimiPrones> arrli22, ArrayList<SigSigurimiBiznesit> arrli23, ArrayList<SigSigurimiKufitar> arrli24) {
	        System.out.println("Agjentet e terenit te rregjistruar:");
	        for (SigShendetiUdhetim sigurim18 : arrli18) {
	            System.out.println("Emer Mbiemer: " + sigurim18.getEmer() + " " + sigurim18.getMbiemer() + " | Email: " + sigurim18.getEmail() + " | Telefon: " + sigurim18.getTelefon());
	        }
	        for (SigSigurimimakines sigurim19 : arrli19) {
	            System.out.println("Emer Mbiemer: " + sigurim19.getEmer() + " " + sigurim19.getMbiemer() + " | Email: " + sigurim19.getEmail() + " | Telefon: " + sigurim19.getTelefon());
	        }
	        for (SigSigurimiStudentit sigurim20 : arrli20) {
	            System.out.println("Emer Mbiemer: " + sigurim20.getEmer() + " " + sigurim20.getMbiemer() + " | Email: " + sigurim20.getEmail() + " | Telefon: " + sigurim20.getTelefon());
	        }
	        for (SigSigurimiFemijet sigurim21 : arrli21) {
	            System.out.println("Emer Mbiemer: " + sigurim21.getEmer() + " " + sigurim21.getMbiemer() + " | Email: " + sigurim21.getEmail() + " | Telefon: " + sigurim21.getTelefon());
	        }
	        for (SigSigurimiPrones sigurim22 : arrli22) {
	            System.out.println("Emer Mbiemer: " + sigurim22.getEmer() + " " + sigurim22.getMbiemer() + " | Email: " + sigurim22.getEmail() + " | Telefon: " + sigurim22.getTelefon());
	        }
	        for (SigSigurimiBiznesit sigurim23 : arrli23) {
	            System.out.println("Emer Mbiemer: " + sigurim23.getEmer() + " " + sigurim23.getMbiemer() + " | Email: " + sigurim23.getEmail() + " | Telefon: " + sigurim23.getTelefon() + " | Emri i biznesit: " + sigurim23.getEmrisubjekt());
	        }
	        for (SigSigurimiKufitar sigurim24 : arrli24) {
	            System.out.println("Emer Mbiemer: " + sigurim24.getEmer() + " " + sigurim24.getMbiemer() + " | Email: " + sigurim24.getEmail() + " | Telefon: " + sigurim24.getTelefon());
	        }
	 	}
 
	 public static void sigurimiMbaron(
			    ArrayList<SigShendetiUdhetim> arrli18, 
			    ArrayList<SigSigurimimakines> arrli19, 
			    ArrayList<SigSigurimiStudentit> arrli20, 
			    ArrayList<SigSigurimiFemijet> arrli21,
			    ArrayList<SigSigurimiKufitar> arrli24) 
			{
			    System.out.println("Sigurimet në perfundim:");

			    Date dataAktuale = new Date();
			    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			    for (SigShendetiUdhetim sigurimi18 : arrli18) {
			        Date datambarimit = sigurimi18.getDatambarimit();
					if (datambarimit.before(dataAktuale)) {
					    System.out.println("Sigurimi: " + sigurimi18.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: mbaruar");
					} else {
					    System.out.println("Sigurimi: " + sigurimi18.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: në vazhdim");
					}
			    }
			    for (SigSigurimimakines sigurimi19 : arrli19) {
			    	 Date datambarimit = sigurimi19.getDatambarimitssm();
						if (datambarimit.before(dataAktuale)) {
						    System.out.println("Sigurimi: " + sigurimi19.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: mbaruar");
						} else {
						    System.out.println("Sigurimi: " + sigurimi19.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: në vazhdim");
						}
			    }
			    for (SigSigurimiStudentit sigurimi20 : arrli20) {
			    	 Date datambarimit = sigurimi20.getDatambarimitsss();
						if (datambarimit.before(dataAktuale)) {
						    System.out.println("Sigurimi: " + sigurimi20.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: mbaruar");
						} else {
						    System.out.println("Sigurimi: " + sigurimi20.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: në vazhdim");
						}
			    }
			    for (SigSigurimiFemijet sigurimi21 : arrli21) {
			    	 Date datambarimit = sigurimi21.getDatambarimitssf();
						if (datambarimit.before(dataAktuale)) {
						    System.out.println("Sigurimi: " + sigurimi21.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: mbaruar");
						} else {
						    System.out.println("Sigurimi: " + sigurimi21.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: në vazhdim");
						}
			    }
			    for (SigSigurimiKufitar sigurimi24 : arrli24) {
			    	 Date datambarimit = sigurimi24.getDatambarimitssk();
						if (datambarimit.before(dataAktuale)) {
						    System.out.println("Sigurimi: " + sigurimi24.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: mbaruar");
						} else {
						    System.out.println("Sigurimi: " + sigurimi24.getEmer() + " | Data e mbarimit: " + sdf.format(datambarimit) + " | Statusi: në vazhdim");
						}
			    }
			}
 
}



	             
	      

	
