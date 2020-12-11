package edu.bbte.projectbluebook.datacatalog.users;

import edu.bbte.projectbluebook.datacatalog.users.util.UtilCollection;
import edu.bbte.projectbluebook.datacatalog.users.model.TokenInfoResponse;
import edu.bbte.projectbluebook.datacatalog.users.service.UserMongoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class TokenInfoTest {

    @Autowired
    private UserMongoService service;

    @MockBean
    private UtilCollection utils;

    @Test
    public void tokenInfo_BadRequest() {
        String body = "null";

        when(utils.validateToken(body)).thenReturn(null);
        assertEquals("Invalid body",
                new ResponseEntity<>(HttpStatus.BAD_REQUEST),
                service.tokenInfo(body));
    }

    @Test
    public void tokenInfo_Success() {

        TokenInfoResponse response = new TokenInfoResponse();
        response.setActive(true);
        response.setUsername("test");
        response.setUserId("adad");
        response.setRole(TokenInfoResponse.RoleEnum.USER);
        response.setIat(10);
        response.setExp(11);
        String body = "ValidBody";
        when(utils.validateToken(body)).thenReturn(response);
        assertEquals("TokenInfo Sent",
                new ResponseEntity<>(response, HttpStatus.OK),
                service.tokenInfo(body));
    }

}
