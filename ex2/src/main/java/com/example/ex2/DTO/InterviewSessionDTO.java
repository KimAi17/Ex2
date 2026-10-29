package com.example.ex2.DTO;

import com.example.ex2.Enum.InterviewResult;
import com.example.ex2.Enum.InterviewType;

public record InterviewSessionDTO(int sessionId,
                                  String candidateName,
                                  InterviewType interviewType,
                                  InterviewerDTO interviewer,
                                  double score,
                                  InterviewResult result)
{
   public InterviewSessionDTO{
//       if(score > 0.0 && score <= 10.0) {
//           System.out.println(candidateName + "has satisfied to give interview by interviewer");
//       } else try {
//           throw new Exception("Your score are not enough to interview!");
//       } catch (Exception e) {
//           throw new RuntimeException(e);
//       }

//       }


       if(score < 0.0 || score > 10.0){
           throw new IllegalArgumentException("Your score are not enough to interview!");
       }
   }
}
