package oit.is.group2.lec5.group2lec5.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import oit.is.group2.lec5.group2lec5.service.AsyncCountFruit56;

@Controller
@RequestMapping("/sample56")
public class Sample56Controller {

  private final Logger logger = LoggerFactory.getLogger(Sample56Controller.class);

  @Autowired
  private AsyncCountFruit56 ac56;

  @GetMapping("step1")
  public SseEmitter pushCount() {

    logger.info("pushCount");

    final SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);//

    try {
      this.ac56.count(emitter);
    } catch (IOException e) {
      logger.warn("Exception:" + e.getClass().getName() + ":" + e.getMessage());
      emitter.complete();
    }
    return emitter;
  }

  @GetMapping("step2")
  public SseEmitter pushFruit() {
  // infoレベルでログを出力する
  logger.info("pushFruit");
  final SseEmitter sseEmitter = new SseEmitter();
  this.ac56.pushFruit(sseEmitter);
  return sseEmitter;
  }

}
