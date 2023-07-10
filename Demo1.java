class Demo1{



public static void main(String str[]){


System.setProperty("webdriver.chrome.driver","driverpath");

WebDriver driver =  new ChromeDriver();

driver.get("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");


WebElement elemnet = driver.findElement(By.xpath("//h3[contains(text(),'25 of 2875 Transactions')]"));

String strVale = element.getText();

//verify header 
if(strVale.equals("25 of 2875 Transactions")){
   System.out.prinln("valaidated");
}else{
 System.out.prinln("valaidated");
}



//-------------------------



}

}




