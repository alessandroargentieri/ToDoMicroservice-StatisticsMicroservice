package com.quicktutorialz.learnmicroservices.SecondStatistics.utilities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class JsonResponseBody {

    @Getter @Setter
    private int server;

    @Getter @Setter
    private Object response;

    public Object getResponse(){
        return response;
    }
}


//----ResponseEntity------//

//header (cookies)

//body (JsonResponseBody)

//------------------------//