package com.spring13;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
//@Scope("singleton")
@Component
public class Ipl {
	
	@Value("DD")
    private String teamName;
	
	@Value("Panth")
    private String captainName;
	
	@Value("#{team}")
    private List<String> players;  //SPEL
	
	@Value("#{60+60}")
    private int x;
	
	@Value("#{50<40?5.5:4.4}")  //by dafault casting
	private int y;
	
	@Value("#{'20h'>'15h'?6:4}")
	private double z;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")  // .cbrt
	private double power;
	
	@Value("#{T(java.lang.Math).PI}")
	private double staticVariale;
	
	@Value("#{5<7}")
	private boolean i;
	
	@Value("#{'Kolkata'}")
	private String stringTypeObjectValue;
    
	
	public String getStringTypeObjectValue() {
		return stringTypeObjectValue;
	}
	public void setStringTypeObjectValue(String stringTypeObjectValue) {
		this.stringTypeObjectValue = stringTypeObjectValue;
	}
	public void setI(boolean i) {
		this.i=i;
	}
	public boolean getI() {
		return i;
	}
	public double getStaticVariale() {
		return staticVariale;
	}
	public void setStaticVariale(double staticVariale) {
		this.staticVariale = staticVariale;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
}
