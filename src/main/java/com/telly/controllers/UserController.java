

import com.telly.dao.FormValidationGroup;
import com.telly.dao.Reserve;
import com.telly.dao.User;
import com.telly.service.ReserveService;
import com.telly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;


public class UserController {

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

}


