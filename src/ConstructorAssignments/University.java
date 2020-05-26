package ConstructorAssignments;
import java.util.ArrayList;
public class University {
     String name;
     String country;
     int establishedDate;
     ArrayList<String> course;
     public University(String name, String country) {
		this.name = name;
		this.country = country;}
	public University(String name, int establishedDate) {
		this.name = name;
		this.establishedDate = establishedDate;}
	public University(String name, String country, int establishedDate, ArrayList<String> course) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;}   
    public String getName() {
		return this.name;}
	public String getCountry() {
		return this.country;}
	public int getEstablishedDate() {
		return this.establishedDate;}
	public ArrayList<String> getCourse() {
		return this.course;}}
