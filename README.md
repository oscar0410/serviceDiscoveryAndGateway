# serviceDiscoveryAndGateway

## 專案啟動順序

    1. eurekaServerDemo
    2. 其他三個Application 先後都沒差

## 說明

    * eurekaServerDemo : Service Discovery Server端
    * eurekaClientDemoGateWay: Spring Cloud Gateway, 外部只需知道這個IP,會依照router設定而導向至所需使用的Application
    * eurekaClientDemoImageService: Image-service Application
    * eurekaClientDemoGalleryService:
    Gallery-service Application, 會呼叫Image-service取得圖片
