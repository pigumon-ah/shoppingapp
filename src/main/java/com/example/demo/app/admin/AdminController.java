package com.example.demo.app.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Mst_staff;
import com.example.demo.repsitry.StaffRepositorydao;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("admin")
@AllArgsConstructor
public class AdminController {

	private final StaffRepositorydao staffrepository;


//ログイン画面 Controller
//---------------------------------------------------
    @GetMapping("top")
    public String top() {
        return "admin/top";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "admin/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "admin/logout";
    }
//---------------------------------------------------
	//ユーザ管理画面Controller user_**
//---------------------------------------------------

	@GetMapping("user_list")
	public String user_list(Model model) {
		// selectしてIDの昇順に。
		List<Mst_staff> userlist = staffrepository.findAll();
		model.addAttribute("userList", userlist);
		return "admin/user_list";
	}

	@GetMapping("user_seach")
	public String user_seach() {
		//クエリパラメータの検索ワードを元にselectしてリストに入れる
		return "admin/user_list";
	}

	@GetMapping("user_edit")
	public String user_edit() {
		//クエリパラメータのstaffidを取得し、
		// staffの情報をhtmlフォームに渡す
		return "admin/user_edit";

	}

	@PostMapping("user_insert")
	public String user_insert() {
		//formで受け取ったユーザ情報を元にinsert
		return "redirect:/admin/user_list";
	}

	@PostMapping("user_update")
	public String user_update() {
		//formで受け取った値で更新を行う
		return "redirect:/admin/user_list";
	}

	@GetMapping("user_delete")
	public String user_delete() {
		//クエリパラメータからstaffIDを取得、delete文を実行
		return "redirect:/admin/user_list";
	}
//------------------------------------------------------

	//商品管理画面Controller  item_**
//------------------------------------------------------
	@GetMapping("item_list")
	public String item_list() {
		// selectしてIDの昇順に。
		return "admin/item_list";
	}

	@GetMapping("item_seach")
	public String item_seach(Model model) {
		//クエリパラメータの検索ワードを元に検索
//		List<Mst_item>itemList = itemrepository.findAll();
//		model.addAttribute(itemList);
		return "admin/item_list";
	}

	@GetMapping("item_edit")
	public String item_edit() {
		//クエリパラメータのstaffidを取得し、
		// staffの情報をhtmlフォームに渡す
		return "admin/item_list";
	}

	@PostMapping("item_insert")
	public String item_insert() {
		//formで受け取った値でinsert
		return "redirect:/admin/item_list";
	}

	@PostMapping("item_update")
	public String item_update() {
		//formで受け取ったあたいでupdate
		return "redirect:/admin/item_list";
	}

	@GetMapping("item_delete")
	public String item_delete() {
		//item_CD リクエストパラメータの値を元にdelete
		return "redirect:/admin/item_list";
	}

	@PostMapping("item_in")
	public String item_in() {
		//formの値を元に入荷情報をinsert
		return "admin/item_in";
	}

//------------------------------------------------------

	//注文管理履歴画面Controller order_**
//------------------------------------------------------
	@GetMapping("order_list")
	public String order_list() {
		// selectしてIDの昇順に。

		return "admin/order_list";
	}

	@GetMapping("order_seach")
	public String order_seach() {
		//クエリパラメータの検索ワードを元に検索
		return "admin/order_list";
	}
	@GetMapping("order_edit")
	public String order_edit() {
		//リクエストパラメータを元に注文詳細情報を表示
		return "admin/order_edit";
	}

	@PostMapping("order_update")
	public String order_update() {
		//formで受け取った値でupdate hiddenで商品コードを受取り？
		return "redirect:/admin/order_list";
	}

	@GetMapping("order_decision")
	public String order_decision() {
		//リクエストパラメータを元に注文を確定させる
		return "redirect:/admin/order_list";
	}
	@GetMapping("order_cancel")
	public String order_cancel() {
		//リクエストパラメータを元に注文をキャンセルする
		return "redirect:/admin/order_list";
	}
//-------------------------------------------------------

	//出荷画面一覧Controller shipping_**
//-------------------------------------------------------

	@GetMapping("shipping_list")
	public String shipping_list() {
		// selectしてIDの昇順に。
		return "admin/shipping_list";
	}

	@GetMapping("shipping_seach")
	public String shipping_seach() {
		//リクエストパラメータを元にselect
		return "admin/shipping_list";
	}

	@GetMapping("shipping_edit")
	public String shipping_edit() {
		//リクエストパラメータを元にselectして渡す
		return "admin/shipping_edit";
	}

	@PostMapping("shipping_update")
	public String shipping_update() {
		//フォーム情報を元にupdate
		return "redirect:/admin/shipping_list";
	}

	@GetMapping("shipping_decision")
	public String shipping_decision() {
		//リクエストパラメータを元に注文を確定させる
		return "redirect:/admin/shipping_list";
	}

//-------------------------------------------------------

}
