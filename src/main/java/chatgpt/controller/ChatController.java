package chatgpt.controller;

import chatgpt.dto.ChatDTO;
import chatgpt.dto.ChatSaidaDTO;
import chatgpt.dto.MensagemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class ChatController {

    private static final String MODEL = "gpt-3.5-turbo";
    private static final int MAX_TOKENS = 100;
    private static final int MAX_COMPLETIONS = 1;
    private static final double TEMPERATURE = 0;
    private static final String URL = "https://api.openai.com/v1/chat/completions";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/chat")
    public ChatSaidaDTO chat(@RequestParam("prompt") String prompt) {
        return restTemplate.postForObject(URL, new ChatDTO(MODEL, List.of(new MensagemDTO("user", prompt)), MAX_COMPLETIONS, TEMPERATURE, MAX_TOKENS), ChatSaidaDTO.class);
    }
}

