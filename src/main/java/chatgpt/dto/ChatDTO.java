package chatgpt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatDTO {

    private String model;
    private List<MensagemDTO> messages;
    private int n;
    private double temperature;
    private int max_tokens;
}
