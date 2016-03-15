1. 在使用Intent启动活动时，intent所携带的category必须是某个活动可以响应的category的子集，否则无法启动。
2. startActivity()方法在启动活动时，会默认添加default category到intent中。