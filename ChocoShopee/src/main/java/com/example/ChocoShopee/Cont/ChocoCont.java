package com.example.ChocoShopee.Cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChocoShopee.Model.ChocoModel;
import com.example.ChocoShopee.Service.ChocoService;

@RestController
public class ChocoCont {
	@Autowired
   public ChocoService cser;
	@GetMapping("/project")
	public List<ChocoModel> main(){
		return cser.main();
	}
	@PostMapping("/signin")
	public ChocoModel sub(@RequestBody ChocoModel rh) {
		return cser.sub(rh);
	}
	@PutMapping("/signup")
	public ChocoModel dub(@RequestBody ChocoModel h) {
		return cser.dub(h);
	}
	@DeleteMapping("/del/{sno}")
	public void delect(@PathVariable("sno") int sno) {
		cser.del(sno);
	}
	
}
