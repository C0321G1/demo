package c0321g1_pawnshop_backend.controller.contract;
<<<<<<< HEAD
=======

import c0321g1_pawnshop_backend.entity.contract.Contract;
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import c0321g1_pawnshop_backend.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@EnableScheduling
public class MailerController {
    @Autowired
    private JavaMailSender emailSender;
    @Autowired
    private ContractService contractService;

<<<<<<< HEAD
    @Scheduled(cron = " 0 55 13 ? * * ")
=======
    @Scheduled(cron = " 0 50 20 ? * * ")
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    public void sendEmail(){
        List<String> listEmailOneTime =contractService.getAllEmailToSend();
        Set<String> listMail = new HashSet<>();
        listMail.addAll(listEmailOneTime);
        if (!(listMail.size()==0)){
            String [] array =listMail.toArray(new String[0]);
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(array);
            message.setSubject("[Thông báo] Hợp đồng Của Bạn Sắp Hết Hạn ");
<<<<<<< HEAD
            message.setText(" Hợp Đồng của bạn sắp hết hạn.Bạn vui lòng liên hệ với cửa hàng.");
            // Send Message!
            this.emailSender.send(message);
        }else{
=======
//            message.setText("Chào, khách hàng " + contract.getCustomer().getName() + "\n"
//                    + "Hợp Đồng của bạn sắp hết hạn, mã hợp đồng là " + contract.getContractCode() + ".");

            // Send Message!
            this.emailSender.send(message);
        }else{
//            System.out.println(contract.getCustomer().getName()+ " Have not email to send!");
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
            System.out.println("Have not email to send!");

        }
    }
}
