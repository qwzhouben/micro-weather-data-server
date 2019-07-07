### 数据来源
http://wthrcdn.etouch.cn/weather_mini?citykey=#{id}
http://wthrcdn.etouch.cn/weather_mini?city=#{name}

### 单块架构的优缺点
**优点**：
- 功能划分清楚
- 层次关系良好
- 每一层独立
- 部署简单
- 技术单一
- 用人成本低

**缺点**：
- 功能仍然太大
- 升级风险高
- 维护成本增加
- 交付周期变长
- 可伸缩性差
- 监控困难

### 微服务架构的设计原则
- 拆分足够微
- 轻量级通信
- 领域驱动原则
- 单一职责原则
- DevOps及两个披萨
- 不限于技术栈