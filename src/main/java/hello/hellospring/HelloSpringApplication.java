package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		//스프링은 톰캣이라는 웹'서버'를 내장하고 있기 때문에 실행 시 서버를 자체적으로 띄우며 스프링부트가 함께 실행됨.
		//스프링의 개발환경 강점.(원래는 서버를 따로 구동시켜주어야함)
	}

}
