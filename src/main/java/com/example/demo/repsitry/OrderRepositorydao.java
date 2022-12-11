package com.example.demo.repsitry;

import java.util.List;

import com.example.demo.entity.Trx_order;

public interface OrderRepositorydao {

	List<Trx_order> selectAllorder();

	List<Trx_order> seachByword(String word);

	Trx_order selectOneorder(String code);

	void order_update();//validationクラスを引数に

	void order_decsion(String code);

	void order_cancel(String code);


}
