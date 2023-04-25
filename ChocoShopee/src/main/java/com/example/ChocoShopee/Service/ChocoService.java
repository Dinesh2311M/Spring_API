package com.example.ChocoShopee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChocoShopee.Model.ChocoModel;
import com.example.ChocoShopee.Repo.ChocoRepo;

@Service
public class ChocoService {
@Autowired
ChocoRepo rr;
public List <ChocoModel> main(){
	return rr.findAll();
}
public ChocoModel sub(ChocoModel h)
{
	return rr.save(h);
}
public ChocoModel dub(ChocoModel h)
{
	return rr.save(h);
}
public void del(int Isno)
{
	rr.deleteById(Isno);
}


}



