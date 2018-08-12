package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doc = new ArrayList<Doctor>();
	ArrayList<Patient> pat = new ArrayList<Patient>();
	int count = 0;

	void addDoctor(Doctor a) {
		doc.add(a);
	}

	void addPatient(Patient b) {
		pat.add(b);
	}

	ArrayList<Patient> getPatients() {
		return pat;
	}

	ArrayList<Doctor> getDoctors() {
		return doc;
	}

	void assignPatientsToDoctors() {
		for (int i = 0; i < pat.size(); i++) {
			if (doc.get(count).getPatients().size() >= 3) {
				count++;
			}
			try {
				doc.get(count).assignPatient(pat.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
