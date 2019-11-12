package com.ylj.order.controller;

/*import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;*/
import com.ylj.order.feign.UserServicceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    UserServicceFeign userServicceFeign;

  /*  @Autowired
    private RestTemplate restTemplate;*/


  public String selectNameByFallBack(){
      return "用户不存在!!!";
  }

    @RequestMapping("/{id}")
    //@HystrixCommand(defaultFallback = "selectNameByFallBack")
    public String selectNameById(@PathVariable("id") Integer orderId){

      //int i = 1/0;
        /*String username = null;
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;

        try {
            //1.创建httpClient
            httpClient = HttpClients.createDefault();
            //2.创建URI
            URIBuilder uriBuilder = new URIBuilder("http://localhost:8080/user/detail");
            uriBuilder.addParameter("id",String.valueOf(orderId));
            URI uri = uriBuilder.build();

            //3.创建HttpGet



            HttpGet httpGet = new HttpGet(uri);
            //4.发送请求
            response = httpClient.execute(httpGet);

            //5.解析响应结果
            if (response != null && response.getStatusLine().getStatusCode() == 200){
                username = EntityUtils.toString(response.getEntity(),"UTF-8");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                //6.关闭资源
                response.close();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/

//        Map<String,String> map = new HashMap();
//        map.put("id",String.valueOf(orderId));
//        String username = restTemplate.getForObject("http://localhost:8080/user/detail?id={id}", String.class,map);

        String username = userServicceFeign.selectNameById(orderId);

        return "这是"+username+"的订单";
    }
}
