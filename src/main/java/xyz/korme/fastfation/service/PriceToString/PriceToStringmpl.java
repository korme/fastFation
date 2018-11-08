package xyz.korme.fastfation.service.PriceToString;

import org.springframework.stereotype.Service;

@Service
public class PriceToStringmpl implements PriceToString{
    public String priceToString(Integer cals){
        StringBuffer price=new StringBuffer(cals.toString());
        if(cals>=100){
            int t=price.length();
            price.insert(price.length()-2,".");
        }
        if(cals<100&&cals>=10){
            price.insert(0,"0.");
        }
        if(cals<10){
            price.insert(0,"0.0");
        }
        return price.toString();
    }
}
