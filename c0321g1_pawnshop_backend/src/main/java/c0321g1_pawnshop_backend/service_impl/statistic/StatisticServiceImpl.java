package c0321g1_pawnshop_backend.service_impl.statistic;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.contract.Contract;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import c0321g1_pawnshop_backend.repository.statictis.StatisticRepository;
import c0321g1_pawnshop_backend.service.statictis.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
@Service
public class StatisticServiceImpl implements StatisticService {
    @Autowired
    private StatisticRepository statisticRepository;
<<<<<<< HEAD

    @Override
    public List<Contract> listStatisticInterest(String startDate, String endDate) {
        return statisticRepository.listStatisticInterest(startDate,endDate);
    }

    @Override
    public List<Contract> listStatisticLiquidation(String startDate, String endDate) {
        return statisticRepository.listStatisticLiquidation(startDate,endDate);
    }

    @Override
    public List<Contract> listStatisticExpected(String startDate, String endDate) {
        return statisticRepository.listStatisticExpected(startDate,endDate);
    }
}
=======
}
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
