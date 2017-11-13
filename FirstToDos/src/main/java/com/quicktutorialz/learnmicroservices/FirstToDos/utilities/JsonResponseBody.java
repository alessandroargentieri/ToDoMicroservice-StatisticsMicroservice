package com.quicktutorialz.learnmicroservices.FirstToDos.utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * JacksonLibrary will traslate it into a JSON for the RestControllerResponse: it will be the Body of the HTTP response
 */
@AllArgsConstructor
public class JsonResponseBody{
    @Getter @Setter
    private int server;
    @Getter @Setter
    private Object response;
}

//----ResponseEntity------//

//header (cookies)

//body (JsonResponseBody)

//------------------------//