package com.nt.Dto.patients;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

import com.nt.Dto.Pageable;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OpdPatienPageDto {

	
	public List<OpdPatientContent> content;
	public Pageable pageable;
	public boolean last;
	public int totalPages;
	public int totalElements;
	public int number;
	public int size;
	public Sort sort;
	public boolean first;
	public int numberOfElements;
	public boolean empty;
	
}
