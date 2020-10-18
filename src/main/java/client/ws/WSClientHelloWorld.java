package client.ws;

import service.*;
import service.RequestData;
import service.ResponseData;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;



@WebService
public class WSClientHelloWorld {


    @WebMethod(operationName = "getWSClientHelloWorld")                                   //объявляем метод как метод сервиса
    public String getHelloWorld(@WebParam(name = "requestData") String requestData) {     //на вход 1 параметр
        ObjectFactory reqOF = new ObjectFactory();                                        //создаем объект для управления объектами сервиса
        RequestData iRequestData = reqOF.createRequestData();                             //создаем объект класса запроса в сервис
        iRequestData.setIntegroMethod("TEST_setIntegroMethod");                           //вставляем значение нужно праметра запроса
        HelloWorld test =  (new HelloWorldService()).getHelloWorldPort();                 //это чтобы создать объект вызова сервиса
        ResponseData iOut = test.getHelloWorld(iRequestData);                             //тут происходит сам вызов сервиса и результат сажаем в переменную типа ответа сервиса (тип класса ответа сервиса)

        return "Succes " + iOut.getStatus();

    }


}





