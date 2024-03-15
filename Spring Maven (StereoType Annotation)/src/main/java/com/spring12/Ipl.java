package com.spring12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	
	@Value("KKR")
    private String teamName;
	
	@Value("Dk")
    private String teamCaptain;
    
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTeamCaptain() {
		return teamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
	
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + "]";
	}
    
	
}
