# 机动车保养维修管理平台

## 系统结构图
![](https://img-blog.csdnimg.cn/20200426103015179.png "系统结构图")

本系统包括三个模块：机动车维修，机动车保养，数据分析与存储。其中又具体分为如下子模块

### 1）机动车维修
1.1）车况损坏情况检查：对车辆的问题以及损坏的地方进行检查，并且与客户沟通，倾听客户对于维修的需求  
1.2）对按照客户的需求来维修车辆的成本进行估价，并告知客户  
1.3）客户对价格满意即可登记具体信息并且系统委派工人  
1.4）工人接到委托信息领取材料去维修车辆
### 2）机动车保养
2.1）检查油料：对于汽车燃油进行检查和补充，对机油和机油滤芯每行驶五千公里就需更换  
2.2）清洗作业：对车辆内外部以及底盘和发动机进行清洗作业  
2.3）紧固作业：检查转向器，横拉杆，直拉杆，各转向臂连接紧固情况  
2.4）润滑作业：按照规定添加润滑油，检查发电机，变速器等配件的油平面情况  
### 3）数据分析与存储
3.1）机动车维修相关数据统计：对机动车维修所用到的各类零件以及零件的生产厂商，数量，价格进行一个表格统计  
3.2）机动车保养相关数据统计：对机动车保养进行过程中所使用的机油和滤芯，以及车辆状况进行表格统计  
3.3）客户信息存储：将客户姓名，电话号码以及对车辆的维修保养情况记录在数据库中  

## 方案设计

### 开发工具
* **Intellij IDEA**
* **Navicat**
### 数据库
* **mysql** 5.7.25

创建数据库表  
![123](https://img-blog.csdnimg.cn/20200426110949356.png "创建数据库")

# 说明
## 1.tomcat中文乱码
Server > VM options 设置为 `-Dfile.encoding=UTF-8` 重启tomcat
## 2.mybatis generator生成
运行maven命令 `mvn mybatis-generator:generate`
## 3.设置自动导入包
file > setting > Editor > General > Auto Import, 按照下图勾选，点击Apply
![](https://img-blog.csdnimg.cn/20200426112654891.png "设置自动导入包")
## 4.mybatis字段下划线转驼峰
在配置文件`mybatis-config.xml`中添加`mapUnderscoreToCamelCase`属性
```
<settings>
    <!--解决，查询返回结果含null没有对应字段值问题-->
    <setting name="callSettersOnNulls" value="true"/>
    <!-- mybatis控制台LOG输出 -->
    <setting name="logImpl" value="LOG4J2" />
    <!-- 下划线转驼峰 -->
    <setting name="mapUnderscoreToCamelCase" value="true" />
</settings>
```