package c0321g1_pawnshop_backend.service_impl.news;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.news.News;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import c0321g1_pawnshop_backend.repository.news.NewsRepository;
import c0321g1_pawnshop_backend.service.news.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;
<<<<<<< HEAD

    @Override
    public List<News> getNewsLimit10() {
        return newsRepository.getNewsLimit10();
    }

    @Override
    public List<News> getNewsMore() {
        return newsRepository.getNewsMore();
    }

    @Override
    public List<News> getNewsLimit5() {
        return newsRepository.getNewsLimit5();
    }

    @Override
    public void save(News news) {
        newsRepository.save(news);
    }
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
