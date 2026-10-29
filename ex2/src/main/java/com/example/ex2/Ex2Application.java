package com.example.ex2;

import com.example.ex2.DTO.InterviewSessionDTO;
import com.example.ex2.DTO.InterviewerDTO;
import com.example.ex2.Enum.InterviewResult;
import com.example.ex2.Enum.InterviewType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex2Application {

	public static void main(String[] args) {
//		// tao doi tuong di phong van va truyen doi tuong vao
		Interviewer interviewer = new Interviewer(
				"N1",
				"Nguyen Van A",
				"vana@123@gmail.com"
		);

	// In ten va email interviewer
		System.out.println("Interviewer Information");
		System.out.println("Name: " + interviewer.getFullName());
		System.out.println("Email: " + interviewer.getEmail());

	// tao 1 doi tuong la buoi phong van va truyen du lieu vao
		InterviewerDTO interviewerDTO = new InterviewerDTO(" N1", "Nguyen Van A", "vana@123@gmail.com");
		InterviewSessionDTO session = new InterviewSessionDTO(
				1,
				"Tran Thi Binh",
				InterviewType.ONLINE,
				interviewerDTO, // tao doi tuong rieng roi truyen vao
				8,
				InterviewResult.PASSED
		);

//		// 3. In thong tin buoi phong van
		System.out.println("===== INTERVIEW INFORMATION =====");
		System.out.println("Session ID: " + session.sessionId());
		System.out.println("Candidate Name: " + session.candidateName());
		System.out.println("Interview Type: " + session.interviewType());
		System.out.println("Interviewer: " + session.interviewer().fullName()); // session vao ddoi tuong interviewer tu interviewer lay getfullName thg interviewer la doi tuong nam trong record interviewDTO ma record la sinh ra getter va constructor dum nhung ko sinh ra setter
		System.out.println("Interviewer Email: " + session.interviewer().email());
		System.out.println("Score: " + session.score());
		System.out.println("Result: " + session.result());

	}

}



