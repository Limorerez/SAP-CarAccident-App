package com.sap.hana.cloud.odata.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getUserServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	  public getUserServlet() {
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		        String type = request.getAuthType();
		        Principal principal = request.getUserPrincipal();
		        response.setContentType("text/plain");
		        PrintWriter out = response.getWriter();
		        out.write(principal.getName());
		       
			System.out.println(" this is the request " + principal.getName() );
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

	}


