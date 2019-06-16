package kr.hs.dgsw.webboard.board_back.Controller;

import kr.hs.dgsw.webboard.board_back.Domain.Post;
import kr.hs.dgsw.webboard.board_back.Service.PostService;
import kr.hs.dgsw.webboard.board_back.Service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping(value = "/posts")//√
    public List<Post> findAll(){return this.postService.findAll();}

    @GetMapping(value = "/find/{id}")//√
    public Post findById(@PathVariable Long id){
        return this.postService.findById(id);}
//githubUpload
    @GetMapping(value = "/postu/{id}")//√
    public List<Post> findByuserId(@PathVariable Long id){return this.postService.findByUserId(id);}
//ddfaf

    @PutMapping(value = "/modify")
    public int modify(@RequestBody Post post ){return this.postService.modify(post);}

    @DeleteMapping(value = "/delete/{id}")
    public int delete(@PathVariable Long id){return this.postService.deleteById(id);}

    @PostMapping(value = "/write")//√
    public Long add(@RequestBody Post post){return this.postService.add(post);}

    @PostMapping(value = "/write/h")
    public Long addWithHashmap(@RequestBody Post post){return this.postService.addWithHashmap(post);}


//    @GetMapping("/list")
//    public List list(){
//
//        @Getter
//        class TmpBoard implements Serializable {
//            int id;
//            String author;
//            String title;
//            LocalDateTime created;
//            public TmpBoard(int id, String authore, String title, LocalDateTime created){
//                this.id = id;
//                this.author = authore;
//                this.title = title;
//                this.created = created;
//            }
//        };
//        List<TmpBoard> list = new ArrayList<>();
//        list.add(new TmpBoard(1,"작성자1","제목스",LocalDateTime.now()));
//        return list;
//    }


}
