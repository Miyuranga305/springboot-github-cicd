package com.javarav.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Ravindu Miyuranga Adhikari !";
	}

//	echo "# springboot-github-cicd" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Miyuranga305/springboot-github-cicd.git
//	git push -u origin main


	public static void main(String[] args) {
		SpringApplication.run(SpringGithubCicdApplication.class, args);
	}

}
