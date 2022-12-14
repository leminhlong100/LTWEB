package controller.client.cart;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.client.ProductDAO;
import entity.Account;
import entity.BillProduct;
import entity.Product;

@WebServlet("/AddToCartControl")
public class AddToCartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String pId = request.getParameter("pid");

		Account account = (Account) session.getAttribute("acc");
		if (account == null) {
			response.sendRedirect(request.getContextPath() + "/client/Login.jsp?pid=" + pId);
		} else {

			int quantity = 1;
			Product product = ProductDAO.getProductByID(pId);
			Object obj = session.getAttribute("cart");
			String getQuantity = request.getParameter("quantity");
			if (getQuantity != null) {
				quantity = Integer.parseInt(getQuantity);
			}
			if (obj == null) {
				BillProduct billProduct = new BillProduct();
				billProduct.setProduct(product);
				billProduct.setQuantity(quantity);
				billProduct.setUnitPrice(product.getPrice());
				Map<String, BillProduct> map = new HashMap<>();
				map.put(pId, billProduct);
				session.setAttribute("cart", map);
			} else {
				Map<String, BillProduct> map = (Map<String, BillProduct>) obj;
				BillProduct billProduct = map.get(pId);
				if (billProduct == null) {
					billProduct = new BillProduct();
					billProduct.setProduct(product);
					billProduct.setQuantity(quantity);
					billProduct.setUnitPrice(product.getPrice());
					map.put(pId, billProduct);
				} else {

					billProduct.setQuantity(billProduct.getQuantity() + quantity);
				}
				session.setAttribute("cart", map);// luu tam vao session

			}
			request.getRequestDispatcher("CartControl").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
