package com.example.demo.repsitry;

import java.util.List;

import com.example.demo.entity.Trx_order_send;

public interface ShippingRepositorydao {

	List<Trx_order_send> selectAllshipping();

	List<Trx_order_send> seachByword(String word);

	Trx_order_send selectOneOrder(String code);

	void update_shipping();//バリデーションフォーム

	void decisionShipping(String code);



}
