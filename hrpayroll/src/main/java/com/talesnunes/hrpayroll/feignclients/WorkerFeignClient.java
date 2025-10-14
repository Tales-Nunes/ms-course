package com.talesnunes.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
}
