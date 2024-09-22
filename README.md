# Spring Boot AOP 範例

這是一個展示如何在 Spring Boot 應用中使用 **Aspect-Oriented Programming  (AOP)** 的範例。本專案主要展示如何使用 AOP 來處理橫切關注點，例如日誌記錄和方法執行時間的計算，從而分離業務邏輯和通用功能，提升程式的可維護性和可擴展性。

## 使用技術

### 1. **Spring Boot**
- **版本**: 3.4.0-SNAPSHOT
- Spring Boot 提供簡化的配置和自動化設定，幫助開發者快速建立生產級應用程式。

### 2. **Spring AOP**
- **版本**: 隨 Spring Boot 一起使用
- **面向方面程式設計 (AOP)** 使開發者能夠將應用中的橫切關注點模組化，這包括日誌記錄、交易管理等功能，將它們從業務邏輯中分離出來。

### 3. **Maven**### 3. **Maven**
- **版本**: 3.x 或更高版本
- Maven 是專案管理和構建工具，負責管理專案的依賴，確保各個依賴包正確地整合到專案中。



## 專案架構

```bash
src
 └── main
     └── java
         └── org.example.aopdemo
             ├── AopdemoApplication.java    # Spring Boot 啟動類
             ├── aspect                     # AOP 切面所在的包
             │   └── LoggingAspect.java     # 處理方法執行前後的日誌記錄
             └── controller
                 └── DemoController.java    # 測試用的 REST 控制器└── DemoController.java    # 測試用的 REST 控制器
##功能說明
-----
1. LoggingAspect 切面
這個切面用來攔截應用中的所有方法，並在方法執行之前和之後記錄日誌。它還負責計算每個方法的執行時間，幫助開發者優化程式的效能。
2. DemoController 控制器
DemoController 提供一個簡單的 REST API，包含測試方法，用來展示 AOP 的功能。當訪問該 API 時，會觸發切面來記錄方法執行的日誌和時間。

