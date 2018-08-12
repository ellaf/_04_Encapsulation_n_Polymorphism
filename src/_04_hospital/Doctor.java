package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> pat2 = new ArrayList<Patient>();

	boolean performsSurgery() {
		return false;
	}

	boolean makesHouseCalls() {
		return false;
	}

	void assignPatient(Patient a) throws DoctorFullException {
		if (pat2.size() >= 3) {
			throw new DoctorFullException();
		} else {
			pat2.add(a);
		}

	}

	ArrayList<Patient> getPatients() {
		return pat2;
	}

	void doMedicine() {

		for (int i = 0; i < pat2.size(); i++) {
			pat2.get(i).checkPulse();
		}

	}

}
