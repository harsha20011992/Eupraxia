package com.myeee;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class BusRoutes extends Activity implements OnItemSelectedListener {
	Spinner spinner1;
	// 0
	String[] bus21h = { "Broadway", "Secretariat", "Chepauk", "Q.M.C",
			"Fore Shore Estate", "A.M.S.Hospital", "Adayar O.T",
			"Indira Nagar Water Tank", "Lattice Bridge Rd. Jn.",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office, Kumaran Nagar",
			"Chemman Cheri", "Navalur Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam" };;
	// 1
	String[] bus19b = { "Saidapet", "Eng.College", "Adayar B.S.",
			"Adayar Depot", "Lattice Bridge", "Kandanchavadi",
			"Thorappakkam Tea Shop", "Mootakaran Chavadi", "Karapakkam",
			"Sozhinganallur P.U.Office", "Kumaran Nagar", "Chemman Cheri",
			"Navalur Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};

	// 2
	String[] m5 = { "Adayar B.S. ", "Adayar Depot ", " Lattice Bridge Rd. Jn.",
			"Kandanchavadi", " Thorappakkam Tea Shop", " Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			" Chemman Cheri", "Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	// 3
	String[] L19B = { "Saidapet", "Eng.College", "Adayar B.S.", "Adayar Depot",
			"Lattice Bridge", "Kandanchavadi", "Thorappakkam Tea Shop",
			"Mootakaran Chavadi", "Karapakkam", "Sozhinganallur P.U.Office",
			"Kumaran Nagar", "Chemman Cheri", "Navalur, Church",
			"Palavasthic Chemicals", "Hindustal Egg. College", "Kelambakkam" };
	// 4
	String[] L21H = { "Broadway", "Secretariat", "Chepauk", "Q.M.C",
			"Fore Shore Estate", "A.M.S.Hospital", "Adayar O.T.",
			"Indira Nagar Water Tank", "Lattice Bridge Rd. Jn.",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur", "Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam" };
	// 5
	String[] S517 = { "Pallavaram", "Chrompet", "T.B.Sanatorium", "Tambaram",
			"Irumbuliyur", "Perungulathur", "Vandaloor", "Vandaloor Zoo",
			"Anna Nagar (Near Vandalur)", "Kolapakkam", "Vengambakkam Rd Jn.",
			"Kandigai", "Mambakkam (Near Ponmar)", "Camp", "Pudupakkam Jn.",
			"Samiyar Pannai", "Kelambakkam", "Salt Office", "Kovalam",
			"Chemmancheri Kuppam", "Thiruvedanthai", "Vadanemili" };
	// 6
	String[] S570 = {
	 "C.M.B.T.", "M.M.D.A.Colony Rd.Jn.", "Jn Of Iii And 1St Ave",
	 "Jaffarkhan Pet", "Cipet", "Guindy R.S, Concorde",
	 "Jn.Of Race Course Rd", "Gurunanak College", "Vijaya Nagar",
	 "I.R.T. Rd.Jn.", "Srp Tools", "Kandanchavadi", "Thorappakkam Tea Shop",
	 "Mootakaran Chavadi", "Karapakkam",
	 "Sozhinganallur P.U.Office","Kumaran Nagar", "Chemman Cheri",
	 "Navalur, Church", "Palavasthic Chemicals", "Hindustal Egg. College",
	 "Kelambakkam"
	};
	//7
	String[] ST151 = { "C.M.B.T.", "M.M.D.A.Colony Rd.Jn.",
			"Jn Of Iii And 1St Ave", "Jaffarkhan Pet", "Cipet", "Guindy R.S",
			"Concorde", "Jn.Of Race Course Rd", "Gurunanak College",
			"Vijaya Nagar", "I.R.T. Rd.Jn.", "Srp Tools", " Kandanchavadi",
			"Thorappakkam Tea Shop", "Mootakaran Chavadi", "Karapakkam",
			"Sozhinganallur P.U.Office", "Kumaran Nagar", "Chemman Cheri",
			"Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam" };
	//8
	String[] S566 = { "Kundrathur B.S", "Andakuppam", "Anakaputhur", "Pammal",
			"Pallavaram", "Chrompet", "T.B.Sanatorium", "Tambaram",
			"Irumbuliyur", "Perungulathur", "Vandaloor", "Vandaloor Zoo",
			"Anna Nagar (Near Vandalur)", "Kolapakkam", "Vengambakkam Rd Jn.",
			"Kandigai", "Mambakkam (Near Ponmar)", "Camp", "Pudupakkam",
			"Samiyar Pannai", "Kelambakkam", "Chengammal Koot Road",
			"Koman Nagar Rd Jn.", "Kalavakkam Tea Stall", "Thirupporur" };
	//9
	String[] S521 = { "Broadway", "Secretariat", "Chepauk", "Q.M.C",
			"Fore Shore Estate", "A.M.S.Hospital", "Adayar O.T.",
			"Indira Nagar Water Tank", "Lattice Bridge Rd. Jn.",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam", "Chengammal Koot Road",
			"Koman Nagar Rd Jn.", "Thirupporur" };
	//10
	String[] S568 = { "Adayar B.S.", "Adayar Depot", "Lattice Bridge",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur,Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam", "Chengammal Koot Road",
			"Koman Nagar Rd Jn.", "Kalavakkam Tea Stall", "Thirupporur",
			"Mettu Thandalam / Poonthandalam Village", "Karungudi Pallam",
			"Koothavakkam School", "Government School / Hospi", "Mamallapuram"

	};
	//11
	String[] S555 = {

	"Tambaram", "Irumbuliyur", "Perungulathur", "Vandaloor", "Vandaloor Zoo",
			"Anna Nagar (Near Vandalur)", "Kolapakkam", "Vengambakkam Rd Jn.",
			"Kandigai", "Mambakkam (Near Ponmar)", "Camp", "Pudupakkam Jn.",
			"Samiyar Pannai", "Kelambakkam", "Chengammal Koot Road",
			"Koman Nagar Rd Jn.", "Kalavakkam Tea Stall", "Thirupporur" };
	//12
	String[] X555 = { "Tambaram", "Irumbuliyur", "Perungulathur", "Vandaloor",
			"Vandaloor Zoo", "Anna Nagar (Near Vandalur)", "Kolapakkam",
			"Vengambakkam Rd Jn.", "Kandigai", "Mambakkam (Near Ponmar)",
			"Camp", "Pudupakkam", "Samiyar Pannai", "Kelambakkam",
			"Chengammal Koot Road", "Koman Nagar Rd Jn.",
			"Kalavakkam Tea Stall", "Thirupporur"

	};
	//13
	String[] W19BV = { "T.Nagar", "Saidapet", "Eng.College",
			"Women'S Polytechnic", "Lattice Bridge", "Kandanchavadi",
			"Thorappakkam Tea Shop", "Mootakaran Chavadi", "Karapakkam",
			"Sozhinganallur P.U.Office", "Kumaran Nagar", "Chemman Cheri",
			"Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	//14
	String[] W219AV = { "Ambathur Estate", "Mogaipair Road Jn.",
			"Thirumangalam", "Anna Nagar Circle", " Hotel Arun",
			"Nungambakkam R.S, Mahalingapuram",
			"Bharathi Nagar(Periyar Pathai)", "T.Nagar", "Saidapet",
			"Concorde", "Eng.College", "Women'S Polytechnic", "Srp Tools",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	//15
	String[] M19A = { "T.Nagar", "Saidapet", "Eng.College", "Adayar B.S.",
			"Adayar Depot", "Lattice Bridge", "Kandanchavadi",
			"Thorappakkam Tea Shop", "Mootakaran Chavadi", "Karapakkam",
			"Sozhinganallur P.U.Office", "Kumaran Nagar", "Chemman Cheri",
			"Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
//16
	String[] S587 = { "Broadway", "Secretariat", "Chepauk", "Q.M.C",
			"Fore Shore Estate", "A.M.S.Hospital", "Adayar O.T.",
			"Adayar Depot", "Thiruvanmiyur", "Kottivakkam", "Palavakkam",
			"Neelankarai", "Vettuvankanni", "Chola Mandal", "Injambakkam",
			"Panaiyur", "Uthandi Village", "Kanathur", "Nature Care Hospital",
			"Muttukkadu Boat Yard", "Kovalam", "Salt Office", " Kelambakkam",
			"Chengammal Koot Road", "Koman Nagar Rd Jn.",
			"Kalavakkam Tea Stall", "Thirupporur"

	};
	//17
	String[] W570V = { "C.M.B.T.", "M.M.D.A.Colony Rd.Jn.",
			"Jn Of Iii And 1St Ave", "Jaffarkhan Pet", "Cipet", "Guindy R.S",
			"Concorde", "Jn.Of Race Course Rd", "Gurunanak College",
			"Vijaya Nagar", "I.R.T. Rd.Jn.", "Srp Tools", "Kandanchavadi",
			"Thorappakkam Tea Shop", "Mootakaran Chavadi", "Karapakkam",
			"Sozhinganallur P.U.Office", "Kumaran Nagar", "Chemman Cheri",
			"Navalur", "Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	//18
	String[] W21HV = { "Broadway", "Secretariat", "Chepauk", "Q.M.C",
			"Fore Shore Estate", "A.M.S.Hospital", "Adayar O.T.",
			"Indira Nagar Water Tank", "Lattice Bridge Rd. Jn.",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur", "Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	//19
	String[] S21HEX = { "Thiruvetriyur B.S", "Thiruvotriyur Temple", "Thangal",
			"N4 Police Station", "Royapuram P.S", "Clive Battery", "Parrys",
			"Broadway", "Secretariat", "Chepauk", "Q.M.C", "Fore Shore Estate",
			"A.M.S.Hospital", "Adayar O.T.", "Lattice Bridge Rd. Jn.",
			"Kandanchavadi", "Thorappakkam Tea Shop", "Mootakaran Chavadi",
			"Karapakkam", "Sozhinganallur P.U.Office", "Kumaran Nagar",
			"Chemman Cheri", "Navalur, Church", "Palavasthic Chemicals",
			"Hindustal Egg. College", "Kelambakkam"

	};
	//20
	String[] X551A = { "Tambaram East", "Convent", "Mahalakshmi Nagar",
			"S.I.V.E.T", "Nanmabgalam Rd. Jn.", "Veerabadra Nagar", "A104",
			"K120", "Madurapakkam", "Ponmar", "Mambakkam Temple",
			"Mambakkam Roce Mill", "Camp", "Pudupakkam", "Samiyar Pannai",
			"Kelambakkam"

	};
	//21
	String[] bus19P = { "Adayar B.S.", "Adayar Depot",
			"Lattice Bridge Rd. Jn.", "Kandanchavadi", "Thorappakkam Tea Shop",
			"Mootakaran Chavadi", "Karapakkam", "Sozhinganallur P.U.Office",
			"Kumaran Nagar", "Chemman Cheri", "Navalur", "Thalambur",
			"Sirucheri", "Sonalur / Pudur", "Pudupakkam", "Vandaloor Rd.Jn",
			"Sathankuppam", "Kelambakkam" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busroutes);

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);

	}

	public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
		// TODO Auto-generated method stub
		if (position == 0) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("21H");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(bus21h[0]);
			
			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(bus21h[bus21h.length - 1]);
			String busroute = "";
			for (int i = 0; i < bus21h.length; i++) {

				busroute += "-->";
				busroute += bus21h[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}
		if (position == 1) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("19B");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(bus19b[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(bus19b[bus19b.length - 1]);
			String busroute = "";
			for (int i = 0; i < bus19b.length; i++) {

				busroute += "-->";
				busroute += bus19b[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}
		if (position == 2) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("M5");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(m5[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(m5[m5.length - 1]);
			String busroute = "";
			for (int i = 0; i < m5.length; i++) {

				busroute += "-->";
				busroute += m5[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}
		if (position == 3) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("L19B");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(L19B[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(L19B[L19B.length - 1]);
			String busroute = "";
			for (int i = 0; i < L19B.length; i++) {

				busroute += "-->";
				busroute += L19B[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}

		if (position == 4) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("L21H");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(L21H[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(L21H[L21H.length - 1]);
			String busroute = "";
			for (int i = 0; i < L21H.length; i++) {

				busroute += "-->";
				busroute += L21H[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}

		if (position == 5) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S517");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S517[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S517[S517.length - 1]);
			String busroute = "";
			for (int i = 0; i < S517.length; i++) {

				busroute += "-->";
				busroute += S517[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}

		if (position == 6) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S570");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S570[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S570[S570.length - 1]);
			String busroute = "";
			for (int i = 0; i < S570.length; i++) {

				busroute += "-->";
				busroute += S570[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}
		if (position == 7) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("ST151");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(ST151[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(ST151[ST151.length - 1]);
			String busroute = "";
			for (int i = 0; i < ST151.length; i++) {

				busroute += "-->";
				busroute += ST151[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
		}
		if (position == 8) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S566");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S566[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S566[S566.length - 1]);
			String busroute = "";
			for (int i = 0; i < S566.length; i++) {

				busroute += "-->";
				busroute += S566[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}

		if (position == 9) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S521");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S521[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S521[S521.length - 1]);
			String busroute = "";
			for (int i = 0; i < S521.length; i++) {

				busroute += "-->";
				busroute += S521[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		if (position == 10) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S568");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S568[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S568[S568.length - 1]);
			String busroute = "";
			for (int i = 0; i < S568.length; i++) {

				busroute += "-->";
				busroute += S568[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		if (position == 11) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S555");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S555[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S555[S555.length - 1]);
			String busroute = "";
			for (int i = 0; i < S555.length; i++) {

				busroute += "-->";
				busroute += S555[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		if (position == 12) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("X555");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(X555[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(X555[X555.length - 1]);
			String busroute = "";
			for (int i = 0; i < X555.length; i++) {

				busroute += "-->";
				busroute += X555[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		if (position == 13) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("W19BV");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(W19BV[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(W19BV[W19BV.length - 1]);
			String busroute = "";
			for (int i = 0; i < W19BV.length; i++) {

				busroute += "-->";
				busroute += W19BV[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		if (position == 14) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("W219AV");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(W219AV[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(W219AV[W219AV.length - 1]);
			String busroute = "";
			for (int i = 0; i < W219AV.length; i++) {

				busroute += "-->";
				busroute += W219AV[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		if (position == 15) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("M19A");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(M19A[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(M19A[M19A.length - 1]);
			String busroute = "";
			for (int i = 0; i < M19A.length; i++) {

				busroute += "-->";
				busroute += M19A[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		if (position == 16) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S587");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S587[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S587[S587.length - 1]);
			String busroute = "";
			for (int i = 0; i < S587.length; i++) {

				busroute += "-->";
				busroute += S587[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		if (position == 17) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("W570V");
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(W570V[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(W570V[W570V.length - 1]);
			String busroute = "";
			for (int i = 0; i < W570V.length; i++) {

				busroute += "-->";
				busroute += W570V[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		
		
		if (position == 18) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("W21HV");
			
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(W21HV[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(W21HV[W21HV.length - 1]);
			String busroute = "";
			for (int i = 0; i < W21HV.length; i++) {

				busroute += "-->";
				busroute += W21HV[i];
				busroute += "\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		if (position == 19) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("S21HEX");
			
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(S21HEX[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(S21HEX[S21HEX.length - 1]);
			String busroute = "";
			for (int i = 0; i < S21HEX.length; i++) {

				busroute += "-->";
				busroute += S21HEX[i];
				busroute +="\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		if (position == 20) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("X551A");
			
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(X551A[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(X551A[X551A.length - 1]);
			String busroute = "";
			for (int i = 0; i < X551A.length; i++) {

				busroute += "-->";
				busroute += X551A[i];
				busroute +="\n";
			}
			tvRoute.setText(busroute);
			tvRoute.setTextColor(Color.GREEN);
			
			
		}
		
		
		if (position == 21) {
			TextView tvNumber = (TextView) findViewById(R.id.tvbusNumber1);
			tvNumber.setText("BUS19P");
			
			TextView tvRoute = (TextView) findViewById(R.id.tvBusRoute);
			TextView tvSource = (TextView) findViewById(R.id.busSource1);
			tvSource.setText(bus19P[0]);

			TextView tvDestination = (TextView) findViewById(R.id.busDestination1);
			tvDestination.setText(bus19P[bus19P.length - 1]);
			String busroute = "";
			for (int i = 0; i < bus19P.length; i++) {

				busroute += "-->";
				busroute += bus19P[i];
				busroute +="\n";
			}
			tvRoute.setTextColor(Color.GREEN);

			tvRoute.setText(busroute);

			
			
		}
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
