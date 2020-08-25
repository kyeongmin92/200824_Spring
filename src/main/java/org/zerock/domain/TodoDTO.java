package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	
	private String title;
	
	@DateTimeFormat(pattern = "yyy/MM/dd")  // samplecontroller의 initBinder 대신 사용
	private Date dueDate;
}
