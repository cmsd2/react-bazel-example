package friends;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import react_samples.Friend;
import react_samples.Friends;

import com.googlecode.protobuf.format.JsonFormat;

@RestController
public class FriendsController {

    @CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping(value="/friends", produces="application/json")
    public String greeting() throws IOException {
        Friend friend1 = Friend.newBuilder().setName("Joe").setId(1).build();
        Friend friend2 = Friend.newBuilder().setName("Tim").setId(2).build();
        Friend friend3 = Friend.newBuilder().setName("Jim").setId(3).build();
        Friend friend4 = Friend.newBuilder().setName("Jane").setId(4).build();
        Friend friend5 = Friend.newBuilder().setName("Anne").setId(5).build();
        Friend friend6 = Friend.newBuilder().setName("Billy").setId(6).build();
        Friend friend7 = Friend.newBuilder().setName("James").setId(7).build();
        Friend friend8 = Friend.newBuilder().setName("Peter").setId(8).build();
        Friend friend9 = Friend.newBuilder().setName("Bill").setId(9).build();
        
        Friends friends = Friends.newBuilder()
                        .addFriends(friend1)
                        .addFriends(friend2)
                        .addFriends(friend3)
                        .addFriends(friend4)
                        .addFriends(friend5)
                        .addFriends(friend6)
                        .addFriends(friend7)
                        .addFriends(friend8)
                        .addFriends(friend9).build();

        StringBuilder sb = new StringBuilder();
        new JsonFormat().print(friends, sb);
        return sb.toString();
    }
}