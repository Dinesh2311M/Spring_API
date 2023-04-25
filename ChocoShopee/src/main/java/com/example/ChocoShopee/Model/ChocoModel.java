package com.example.ChocoShopee.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;


@Entity

public class ChocoModel {
	@Id
	private int a_sno;
	private String b_name;
	private int c_quantity;
	private int d_energy;
	private int e_calories;
	private int f_price;
	private String g_payment;
	private int h_rating;
	public int getA_sno() {
		return a_sno;
	}
	public void setA_sno(int a_sno) {
		this.a_sno = a_sno;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getC_quantity() {
		return c_quantity;
	}
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	public int getD_energy() {
		return d_energy;
	}
	public void setD_energy(int d_energy) {
		this.d_energy = d_energy;
	}
	public int getE_calories() {
		return e_calories;
	}
	public void setE_calories(int e_calories) {
		this.e_calories = e_calories;
	}
	public int getF_price() {
		return f_price;
	}
	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	public String getG_payment() {
		return g_payment;
	}
	public void setG_payment(String g_payment) {
		this.g_payment = g_payment;
	}
	public int getH_rating() {
		return h_rating;
	}
	public void setH_rating(int h_rating) {
		this.h_rating = h_rating;
	}

}
