package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    //같은 타입의 빈이 여러개더라도 우선적으로 Primary되어있는 bena객체를 주입한다.
public class Chicken implements Food {

    @Override
    public void eat(){
        System.out.println("치킨을 먹습니다.");
    }
}
