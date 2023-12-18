package chatgpt.dto;

import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatSaidaDTO {
    private List<EscolhaDTO> choices;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class EscolhaDTO {
        private int index;
        private MensagemDTO message;
    }
}