package api.idlyexpress.apis.apipageclasses; 

public class CreateNewOrderDataset{

public static final int datasetLength = 1; 

public static String projectName = "idlyexpress";

			/*--------Default Dataset-----------*/

public static final String datasetHeader1 = "TC_CreateOrder-Default";

public static final String datasetResources1 = "createNewOrder";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "CreateNewOrder";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";

public static final String authenticationData1 = "{\"authtype\":\"bearertoken\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"devrabbit\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InBxdVh1YXFScTJQczdqejhoRVNLLSJ9.eyJuaWNrbmFtZSI6InBpY3N0YXIiLCJuYW1lIjoicGljc3RhcmZhbiIsInBpY3R1cmUiOiJodHRwczovL3MzLnVzLXdlc3QtMi5hbWF6b25hd3MuY29tL3BpY3N0YXIvcHJvZmlsZV9waWNzLzM2YzMzM2VjLTMyYzItNDU5OS1iMWFlLWMxMDIwOWE2ZDQwMy5qcGVnIiwidXBkYXRlZF9hdCI6IjIwMjEtMDgtMTdUMDY6MDI6MDAuMjg4WiIsImVtYWlsIjoicGljc3RhckBnbWFpbC5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImlzcyI6Imh0dHBzOi8vZGV2LWZ3aHVnbXVzLnVzLmF1dGgwLmNvbS8iLCJzdWIiOiJhdXRoMHw2MGUzZjE0YTY0MjQ0MjAwNzExYmY2NjIiLCJhdWQiOiJLNGFRR0lmdG9TdmYxT1pWYXN4OWVtTWprRkY1REN3YSIsImlhdCI6MTYyOTE4MDEyMCwiZXhwIjoxNjM5NTQ4MjUyfQ.AnpXeT7kJ4hxbA6EQC18yb3dUZEDInjzdiSIbdWZRaid9sPcQfmkGBpbq7xfT78oYLESmqEqABYv7FIdytvv9C72G0zNsKro-edAFFPetljNthaq55lEVqQiJmVPQfmgTkYV9WzXgl6-raDx9trOuC43ZTOWO0WKBJc5NPH8pTsa0s1JRdw195VdwSBzpXMsn95eDsFS1Z2SRu_SXx8Sc2355r-y-aZjvXXWoqNJCInylWn0vuypKGvG_FsDb7tSaArT_fNM088S6R6DectPMHMPA93qZ9qLM9N5NDO6V6SmXvkEqd1IzpGFt6Z0KT9YbXx4L-w4XNqPn8Y66EqUTg\"},"
 + "\"oauth2\":{\"tokenurl\":\"\","
 + "\"clientid\":\"\","
 + "\"clientsecret\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\\"address_id\\\":25,"
 + "\\\"payment_info\\\":\\\"{\\\\n  \\\\\\\"id\\\\\\\": \\\\\\\"ch_3Jc5c7EGGwAllWGZ1av6ioH3\\\\\\\","
 + "\\\\n  \\\\\\\"object\\\\\\\": \\\\\\\"charge\\\\\\\","
 + "\\\\n  \\\\\\\"amount\\\\\\\": 3300,"
 + "\\\\n  \\\\\\\"amount_captured\\\\\\\": 3300,"
 + "\\\\n  \\\\\\\"amount_refunded\\\\\\\": 0,"
 + "\\\\n  \\\\\\\"application\\\\\\\": null,"
 + "\\\\n  \\\\\\\"application_fee\\\\\\\": null,"
 + "\\\\n  \\\\\\\"application_fee_amount\\\\\\\": null,"
 + "\\\\n  \\\\\\\"balance_transaction\\\\\\\": \\\\\\\"txn_3Jc5c7EGGwAllWGZ1GMNszXz\\\\\\\","
 + "\\\\n  \\\\\\\"billing_details\\\\\\\": {\\\\n    \\\\\\\"address\\\\\\\": {\\\\n      \\\\\\\"city\\\\\\\": null,"
 + "\\\\n      \\\\\\\"country\\\\\\\": null,"
 + "\\\\n      \\\\\\\"line1\\\\\\\": null,"
 + "\\\\n      \\\\\\\"line2\\\\\\\": null,"
 + "\\\\n      \\\\\\\"postal_code\\\\\\\": null,"
 + "\\\\n      \\\\\\\"state\\\\\\\": null\\\\n    },"
 + "\\\\n    \\\\\\\"email\\\\\\\": null,"
 + "\\\\n    \\\\\\\"name\\\\\\\": null,"
 + "\\\\n    \\\\\\\"phone\\\\\\\": null\\\\n  },"
 + "\\\\n  \\\\\\\"calculated_statement_descriptor\\\\\\\": \\\\\\\"Stripe\\\\\\\","
 + "\\\\n  \\\\\\\"captured\\\\\\\": true,"
 + "\\\\n  \\\\\\\"created\\\\\\\": 1632217811,"
 + "\\\\n  \\\\\\\"currency\\\\\\\": \\\\\\\"usd\\\\\\\","
 + "\\\\n  \\\\\\\"customer\\\\\\\": null,"
 + "\\\\n  \\\\\\\"description\\\\\\\": \\\\\\\"test\\\\\\\","
 + "\\\\n  \\\\\\\"destination\\\\\\\": null,"
 + "\\\\n  \\\\\\\"dispute\\\\\\\": null,"
 + "\\\\n  \\\\\\\"disputed\\\\\\\": false,"
 + "\\\\n  \\\\\\\"failure_code\\\\\\\": null,"
 + "\\\\n  \\\\\\\"failure_message\\\\\\\": null,"
 + "\\\\n  \\\\\\\"fraud_details\\\\\\\": {\\\\n  },"
 + "\\\\n  \\\\\\\"invoice\\\\\\\": null,"
 + "\\\\n  \\\\\\\"livemode\\\\\\\": false,"
 + "\\\\n  \\\\\\\"metadata\\\\\\\": {\\\\n  },"
 + "\\\\n  \\\\\\\"on_behalf_of\\\\\\\": null,"
 + "\\\\n  \\\\\\\"order\\\\\\\": null,"
 + "\\\\n  \\\\\\\"outcome\\\\\\\": {\\\\n    \\\\\\\"network_status\\\\\\\": \\\\\\\"approved_by_network\\\\\\\","
 + "\\\\n    \\\\\\\"reason\\\\\\\": null,"
 + "\\\\n    \\\\\\\"risk_level\\\\\\\": \\\\\\\"normal\\\\\\\","
 + "\\\\n    \\\\\\\"risk_score\\\\\\\": 50,"
 + "\\\\n    \\\\\\\"seller_message\\\\\\\": \\\\\\\"Payment complete.\\\\\\\","
 + "\\\\n    \\\\\\\"type\\\\\\\": \\\\\\\"authorized\\\\\\\"\\\\n  },"
 + "\\\\n  \\\\\\\"paid\\\\\\\": true,"
 + "\\\\n  \\\\\\\"payment_intent\\\\\\\": null,"
 + "\\\\n  \\\\\\\"payment_method\\\\\\\": \\\\\\\"card_1Jc5c6EGGwAllWGZ2B946CiE\\\\\\\","
 + "\\\\n  \\\\\\\"payment_method_details\\\\\\\": {\\\\n    \\\\\\\"card\\\\\\\": {\\\\n      \\\\\\\"brand\\\\\\\": \\\\\\\"visa\\\\\\\","
 + "\\\\n      \\\\\\\"checks\\\\\\\": {\\\\n        \\\\\\\"address_line1_check\\\\\\\": null,"
 + "\\\\n        \\\\\\\"address_postal_code_check\\\\\\\": null,"
 + "\\\\n        \\\\\\\"cvc_check\\\\\\\": \\\\\\\"pass\\\\\\\"\\\\n      },"
 + "\\\\n      \\\\\\\"country\\\\\\\": \\\\\\\"US\\\\\\\","
 + "\\\\n      \\\\\\\"exp_month\\\\\\\": 2,"
 + "\\\\n      \\\\\\\"exp_year\\\\\\\": 2042,"
 + "\\\\n      \\\\\\\"fingerprint\\\\\\\": \\\\\\\"spD5SpSsnUYdzunD\\\\\\\","
 + "\\\\n      \\\\\\\"funding\\\\\\\": \\\\\\\"credit\\\\\\\","
 + "\\\\n      \\\\\\\"installments\\\\\\\": null,"
 + "\\\\n      \\\\\\\"last4\\\\\\\": \\\\\\\"4242\\\\\\\","
 + "\\\\n      \\\\\\\"network\\\\\\\": \\\\\\\"visa\\\\\\\","
 + "\\\\n      \\\\\\\"three_d_secure\\\\\\\": null,"
 + "\\\\n      \\\\\\\"wallet\\\\\\\": null\\\\n    },"
 + "\\\\n    \\\\\\\"type\\\\\\\": \\\\\\\"card\\\\\\\"\\\\n  },"
 + "\\\\n  \\\\\\\"receipt_email\\\\\\\": null,"
 + "\\\\n  \\\\\\\"receipt_number\\\\\\\": null,"
 + "\\\\n  \\\\\\\"receipt_url\\\\\\\": \\\\\\\"https://pay.stripe.com/receipts/acct_1JIBZhEGGwAllWGZ/ch_3Jc5c7EGGwAllWGZ1av6ioH3/rcpt_KGcrkpZQrvBupDIQRgwEhcimwh29aIj\\\\\\\","
 + "\\\\n  \\\\\\\"refunded\\\\\\\": false,"
 + "\\\\n  \\\\\\\"refunds\\\\\\\": {\\\\n    \\\\\\\"object\\\\\\\": \\\\\\\"list\\\\\\\","
 + "\\\\n    \\\\\\\"data\\\\\\\": [\\\\n\\\\n    ],"
 + "\\\\n    \\\\\\\"has_more\\\\\\\": false,"
 + "\\\\n    \\\\\\\"total_count\\\\\\\": 0,"
 + "\\\\n    \\\\\\\"url\\\\\\\": \\\\\\\"/v1/charges/ch_3Jc5c7EGGwAllWGZ1av6ioH3/refunds\\\\\\\"\\\\n  },"
 + "\\\\n  \\\\\\\"review\\\\\\\": null,"
 + "\\\\n  \\\\\\\"shipping\\\\\\\": null,"
 + "\\\\n  \\\\\\\"source\\\\\\\": {\\\\n    \\\\\\\"id\\\\\\\": \\\\\\\"card_1Jc5c6EGGwAllWGZ2B946CiE\\\\\\\","
 + "\\\\n    \\\\\\\"object\\\\\\\": \\\\\\\"card\\\\\\\","
 + "\\\\n    \\\\\\\"address_city\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_country\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_line1\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_line1_check\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_line2\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_state\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_zip\\\\\\\": null,"
 + "\\\\n    \\\\\\\"address_zip_check\\\\\\\": null,"
 + "\\\\n    \\\\\\\"brand\\\\\\\": \\\\\\\"Visa\\\\\\\","
 + "\\\\n    \\\\\\\"country\\\\\\\": \\\\\\\"US\\\\\\\","
 + "\\\\n    \\\\\\\"customer\\\\\\\": null,"
 + "\\\\n    \\\\\\\"cvc_check\\\\\\\": \\\\\\\"pass\\\\\\\","
 + "\\\\n    \\\\\\\"dynamic_last4\\\\\\\": null,"
 + "\\\\n    \\\\\\\"exp_month\\\\\\\": 2,"
 + "\\\\n    \\\\\\\"exp_year\\\\\\\": 2042,"
 + "\\\\n    \\\\\\\"fingerprint\\\\\\\": \\\\\\\"spD5SpSsnUYdzunD\\\\\\\","
 + "\\\\n    \\\\\\\"funding\\\\\\\": \\\\\\\"credit\\\\\\\","
 + "\\\\n    \\\\\\\"last4\\\\\\\": \\\\\\\"4242\\\\\\\","
 + "\\\\n    \\\\\\\"metadata\\\\\\\": {\\\\n    },"
 + "\\\\n    \\\\\\\"name\\\\\\\": null,"
 + "\\\\n    \\\\\\\"tokenization_method\\\\\\\": null\\\\n  },"
 + "\\\\n  \\\\\\\"source_transfer\\\\\\\": null,"
 + "\\\\n  \\\\\\\"statement_descriptor\\\\\\\": null,"
 + "\\\\n  \\\\\\\"statement_descriptor_suffix\\\\\\\": null,"
 + "\\\\n  \\\\\\\"status\\\\\\\": \\\\\\\"succeeded\\\\\\\","
 + "\\\\n  \\\\\\\"transfer_data\\\\\\\": null,"
 + "\\\\n  \\\\\\\"transfer_group\\\\\\\": null\\\\n}\\\\n\\\","
 + "\\\"products_list\\\":[{\\\"product_id\\\":148,"
 + "\\\"quantity\\\":1}],"
 + "\\\"user_id\\\":\\\"google-oauth2|103072056434732149590\\\"}\","
 + "\"raw_id\":1443,"
 + "\"dataset_id\":1725,"
 + "\"raw_type_id\":3}";

}