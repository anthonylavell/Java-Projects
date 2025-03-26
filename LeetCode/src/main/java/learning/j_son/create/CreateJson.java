package learning.j_son.create;

public class CreateJson {
    public static String getAllPartner(){
        return  """
                {
                  "partners": [
                    {
                      "firstName": "Darin",
                      "lastName": "Daignault",
                      "email": "ddaignault@hubspotpartners.com",
                      "country": "United States",
                      "availableDates": [
                        "2017-05-03",
                        "2017-05-06"
                      ]
                    },
                    {
                      "firstName": "Crystal",
                      "lastName": "Brenna",
                      "email": "cbrenna@hubspotpartners.com",
                      "country": "Ireland",
                      "availableDates": [
                        "2017-04-27",
                        "2017-04-29",
                        "2017-04-30"
                      ]
                    },
                    {
                      "firstName": "Janyce",
                      "lastName": "Gustison",
                      "email": "jgustison@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-29",
                        "2017-04-30",
                        "2017-05-01"
                      ]
                    },
                    {
                      "firstName": "Tifany",
                      "lastName": "Mozie",
                      "email": "tmozie@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-28",
                        "2017-04-29",
                        "2017-05-01",
                        "2017-05-04"
                      ]
                    },
                    {
                      "firstName": "Temple",
                      "lastName": "Affelt",
                      "email": "taffelt@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-28",
                        "2017-04-29",
                        "2017-05-02",
                        "2017-05-04"
                      ]
                    },
                    {
                      "firstName": "Robyn",
                      "lastName": "Yarwood",
                      "email": "ryarwood@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-29",
                        "2017-04-30",
                        "2017-05-02",
                        "2017-05-03"
                      ]
                    },
                    {
                      "firstName": "Shirlene",
                      "lastName": "Filipponi",
                      "email": "sfilipponi@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-30",
                        "2017-05-01"
                      ]
                    },
                    {
                      "firstName": "Oliver",
                      "lastName": "Majica",
                      "email": "omajica@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-28",
                        "2017-04-29",
                        "2017-05-01",
                        "2017-05-03"
                      ]
                    },
                    {
                      "firstName": "Wilber",
                      "lastName": "Zartman",
                      "email": "wzartman@hubspotpartners.com",
                      "country": "Spain",
                      "availableDates": [
                        "2017-04-29",
                        "2017-04-30",
                        "2017-05-02",
                        "2017-05-03"
                      ]
                    },
                    {
                      "firstName": "Eugena",
                      "lastName": "Auther",
                      "email": "eauther@hubspotpartners.com",
                      "country": "United States",
                      "availableDates": [
                        "2017-05-04",
                        "2017-05-09"
                      ]
                    }
                  ]
                }
                """;
    }

    public static String getAllCallRecord(){
        return """
                {
                "callRecords": [
                {
                "customerId": 20205,
                "callId": "373f7f26-3b5b-44db-8163-44c395973e12",
                "startTimestamp": 1705687800000,
                "endTimestamp": 1705693380000
                },
                {
                "customerId": 53596,
                "callId": "b029a7af-3d54-4f0d-8b31-d30aac36e5a4",
                "startTimestamp": 1704888660000,
                "endTimestamp": 1704891360000
                },
                {
                "customerId": 11106,
                "callId": "3423fe9b-2fa5-40a1-8e5c-cb6c723b102e",
                "startTimestamp": 1705219740000,
                "endTimestamp": 1705222440000
                },
                {
                "customerId": 62060,
                "callId": "c12de857-7728-4c35-8795-1a06e2ee2c4a",
                "startTimestamp": 1704801660000,
                "endTimestamp": 1704802560000
                },
                {
                "customerId": 5481,
                "callId": "e027bf63-5764-409c-b48a-19bf337309b1",
                "startTimestamp": 1705231260000,
                "endTimestamp": 1705237920000
                },
                {
                "customerId": 74348,
                "callId": "4e7af218-e5f4-4842-98de-c592c1a4bd7b",
                "startTimestamp": 1705133580000,
                "endTimestamp": 1705136280000
                },
                {
                "customerId": 20205,
                "callId": "6f1ae36b-46c9-4560-b05c-80022ed858d1",
                "startTimestamp": 1705580340000,
                "endTimestamp": 1705581240000
                },
                {
                "customerId": 20205,
                "callId": "58bd88a6-8e72-4ac5-8a53-053fb5a817a8",
                "startTimestamp": 1705306260000,
                "endTimestamp": 1705308960000
                },
                {
                "customerId": 34481,
                "callId": "d4b15780-46ec-40b6-8f34-2a6be63bc4dd",
                "startTimestamp": 1705268280000,
                "endTimestamp": 1705271880000
                },
                {
                "customerId": 20205,
                "callId": "6e87c4fa-67a4-449e-a6cf-bda96f72596a",
                "startTimestamp": 1705490760000,
                "endTimestamp": 1705497420000
                },
                {
                "customerId": 20205,
                "callId": "cdefa296-f77d-4483-ae72-b54c854fa356",
                "startTimestamp": 1705483740000,
                "endTimestamp": 1705485420000
                },
                {
                "customerId": 11106,
                "callId": "d10fd189-534c-4000-8f4a-d57b5fc55dff",
                "startTimestamp": 1705397340000,
                "endTimestamp": 1705399020000
                },
                {
                "customerId": 20205,
                "callId": "c5be8bdf-a980-421b-af4d-30582f419d7c",
                "startTimestamp": 1705579980000,
                "endTimestamp": 1705580880000
                },
                {
                "customerId": 53596,
                "callId": "162af121-1d46-443e-896c-aa6162d63b4b",
                "startTimestamp": 1704614460000,
                "endTimestamp": 1704617160000
                },
                {
                "customerId": 34481,
                "callId": "fa32d4a0-77e3-471a-8e75-624709ca1c0c",
                "startTimestamp": 1704873900000,
                "endTimestamp": 1704876600000
                },
                {
                "customerId": 74348,
                "callId": "f3bdabc4-0c54-4e95-8abc-530cfee5a3fd",
                "startTimestamp": 1705310700000,
                "endTimestamp": 1705312380000
                },
                {
                "customerId": 4950,
                "callId": "f483762a-1ce7-4ed2-bce0-b81ba4ba0a96",
                "startTimestamp": 1704787500000,
                "endTimestamp": 1704790200000
                },
                {
                "customerId": 74348,
                "callId": "e7b57bc2-8482-4cf8-9b43-581dc96d4c94",
                "startTimestamp": 1705527720000,
                "endTimestamp": 1705531320000
                },
                {
                "customerId": 94631,
                "callId": "62f002c5-54fb-4657-ae97-15f71947b029",
                "startTimestamp": 1705234140000,
                "endTimestamp": 1705235040000
                },
                {
                "customerId": 5481,
                "callId": "b979600f-1392-465e-b0cb-e8f7d622a128",
                "startTimestamp": 1705230960000,
                "endTimestamp": 1705237620000
                },
                {
                "customerId": 5481,
                "callId": "2e6280e0-fd3b-41b6-8609-87f39505034a",
                "startTimestamp": 1705441320000,
                "endTimestamp": 1705444920000
                },
                {
                "customerId": 4950,
                "callId": "f20507d9-9722-4dd9-98dc-33a79b84b5dc",
                "startTimestamp": 1705181580000,
                "endTimestamp": 1705185180000
                },
                {
                "customerId": 66230,
                "callId": "5b8892dc-0b2f-4f04-9a48-8aea07cef43a",
                "startTimestamp": 1704974580000,
                "endTimestamp": 1704975480000
                },
                {
                "customerId": 74348,
                "callId": "335a14c8-5315-4963-961d-87b4f372a49d",
                "startTimestamp": 1705406940000,
                "endTimestamp": 1705407840000
                },
                {
                "customerId": 94631,
                "callId": "8349645c-30d3-4358-bddf-f5021ff1148d",
                "startTimestamp": 1705234200000,
                "endTimestamp": 1705235100000
                },
                {
                "customerId": 11106,
                "callId": "bd201547-6ae7-4dab-ba52-3a057167b89c",
                "startTimestamp": 1705220100000,
                "endTimestamp": 1705222800000
                },
                {
                "customerId": 34481,
                "callId": "4951cc8d-c580-41fb-b8f2-0ae0081a6f3b",
                "startTimestamp": 1705254540000,
                "endTimestamp": 1705256700000
                },
                {
                "customerId": 66230,
                "callId": "bc8c85fd-7c32-479d-984b-9ecac9eb8de5",
                "startTimestamp": 1705082640000,
                "endTimestamp": 1705088220000
                },
                {
                "customerId": 5481,
                "callId": "ec9bb11f-4d29-4931-809a-499697e7ec42",
                "startTimestamp": 1705231020000,
                "endTimestamp": 1705237680000
                },
                {
                "customerId": 62060,
                "callId": "6e134e8f-df88-4c98-a835-9a1aa6bfc0e2",
                "startTimestamp": 1704528000000,
                "endTimestamp": 1704530700000
                },
                {
                "customerId": 4950,
                "callId": "d39b3187-83b7-469f-a448-9d5d48d69a7c",
                "startTimestamp": 1705061760000,
                "endTimestamp": 1705064460000
                },
                {
                "customerId": 66230,
                "callId": "c7a3d632-9070-4c51-a20f-c16f67c5c461",
                "startTimestamp": 1705081740000,
                "endTimestamp": 1705083900000
                },
                {
                "customerId": 5481,
                "callId": "1c5b5b0b-0459-44ad-ac81-41af81290aed",
                "startTimestamp": 1705427640000,
                "endTimestamp": 1705429800000
                },
                {
                "customerId": 5481,
                "callId": "5126c13c-d5af-4348-8e7d-4d5968b63b4b",
                "startTimestamp": 1705321020000,
                "endTimestamp": 1705323720000
                },
                {
                "customerId": 53596,
                "callId": "55a27187-538a-4f57-a3be-4dd5be2153d1",
                "startTimestamp": 1704888720000,
                "endTimestamp": 1704891420000
                },
                {
                "customerId": 5481,
                "callId": "bcfcf82d-23fb-47dc-a535-31b670933a0f",
                "startTimestamp": 1705428720000,
                "endTimestamp": 1705434300000
                },
                {
                "customerId": 62060,
                "callId": "3ae8db7c-7d9c-4d45-89ef-02974be6bb2d",
                "startTimestamp": 1704802200000,
                "endTimestamp": 1704804900000
                },
                {
                "customerId": 74348,
                "callId": "13b8f373-5b8e-492c-8d11-1c2d51432f26",
                "startTimestamp": 1705527660000,
                "endTimestamp": 1705531260000
                },
                {
                "customerId": 11106,
                "callId": "edc9892c-3067-443d-9b98-2d69d918e7d4",
                "startTimestamp": 1705600860000,
                "endTimestamp": 1705603020000
                },
                {
                "customerId": 4950,
                "callId": "d341cfe9-5aea-428f-b52b-f77b03087ea4",
                "startTimestamp": 1705169040000,
                "endTimestamp": 1705174620000
                },
                {
                "customerId": 74348,
                "callId": "cb19feef-3ca6-410a-913d-b368ad8cc0af",
                "startTimestamp": 1705407180000,
                "endTimestamp": 1705408080000
                },
                {
                "customerId": 66230,
                "callId": "65ed30d0-7e93-441f-8113-9f0262cea8ee",
                "startTimestamp": 1705081680000,
                "endTimestamp": 1705083840000
                },
                {
                "customerId": 11106,
                "callId": "469833d8-9d01-4f46-bff4-f38ac93b67cb",
                "startTimestamp": 1705397280000,
                "endTimestamp": 1705398960000
                },
                {
                "customerId": 74348,
                "callId": "901f0c42-3c03-490c-acb6-1b7e1a239149",
                "startTimestamp": 1705317780000,
                "endTimestamp": 1705324440000
                },
                {
                "customerId": 94631,
                "callId": "08b6e632-de4d-4fc5-8202-78b01d973642",
                "startTimestamp": 1705342200000,
                "endTimestamp": 1705347780000
                },
                {
                "customerId": 20205,
                "callId": "0bac11f8-50cc-41ce-bef7-43c23a7110ff",
                "startTimestamp": 1705700820000,
                "endTimestamp": 1705704420000
                },
                {
                "customerId": 34481,
                "callId": "679cae5a-1fef-4d09-b96f-2e13f8b579ce",
                "startTimestamp": 1705148100000,
                "endTimestamp": 1705150800000
                },
                {
                "customerId": 11106,
                "callId": "3a5059dc-dcf4-4b6e-af0c-d7154de6d8ce",
                "startTimestamp": 1705397220000,
                "endTimestamp": 1705398900000
                },
                {
                "customerId": 94631,
                "callId": "2ec54ac8-f069-41b1-82d5-74fca709c019",
                "startTimestamp": 1705341120000,
                "endTimestamp": 1705343280000
                },
                {
                "customerId": 4950,
                "callId": "6c35bfc3-77fb-405b-8490-ae2df78e6e61",
                "startTimestamp": 1705168080000,
                "endTimestamp": 1705170240000
                },
                {
                "customerId": 53596,
                "callId": "b6b44863-b54b-4461-b00f-ad0100e87ff6",
                "startTimestamp": 1704996180000,
                "endTimestamp": 1705001760000
                },
                {
                "customerId": 5481,
                "callId": "12fee4bc-c62c-4292-b4ae-fe791619c1c3",
                "startTimestamp": 1705321260000,
                "endTimestamp": 1705323960000
                },
                {
                "customerId": 74348,
                "callId": "c7a6d734-9202-439c-bd80-a76a61d3bd9e",
                "startTimestamp": 1705514880000,
                "endTimestamp": 1705520460000
                },
                {
                "customerId": 20205,
                "callId": "8b2e40f0-c150-4b3d-938c-3894b09bade4",
                "startTimestamp": 1705688220000,
                "endTimestamp": 1705693800000
                },
                {
                "customerId": 74348,
                "callId": "9d7cf558-da9c-4ab5-baf5-f449aac27f6b",
                "startTimestamp": 1705310400000,
                "endTimestamp": 1705312080000
                },
                {
                "customerId": 11106,
                "callId": "3af527ea-669c-4e7f-884c-c5bb78ed1a7c",
                "startTimestamp": 1705600680000,
                "endTimestamp": 1705602840000
                },
                {
                "customerId": 11106,
                "callId": "fc0c5985-b742-4c46-a234-b85e341e3c81",
                "startTimestamp": 1705601640000,
                "endTimestamp": 1705607220000
                },
                {
                "customerId": 5481,
                "callId": "c53cfc9d-2717-46df-801f-b208683ebafb",
                "startTimestamp": 1705428660000,
                "endTimestamp": 1705434240000
                },
                {
                "customerId": 4950,
                "callId": "a61dbe0c-4d36-45a3-9d42-04aaa3eae30b",
                "startTimestamp": 1704787560000,
                "endTimestamp": 1704790260000
                },
                {
                "customerId": 20205,
                "callId": "bb5ed98f-a2f8-41d9-a936-89601a7baea7",
                "startTimestamp": 1705700340000,
                "endTimestamp": 1705703940000
                },
                {
                "customerId": 74348,
                "callId": "d62df1a5-9f9d-4526-a31d-e525b496edeb",
                "startTimestamp": 1705310820000,
                "endTimestamp": 1705312500000
                },
                {
                "customerId": 66230,
                "callId": "b19d5940-db61-4937-95f5-0fd8405411c8",
                "startTimestamp": 1704878100000,
                "endTimestamp": 1704879780000
                },
                {
                "customerId": 20205,
                "callId": "ec8a1b43-cdd5-4cfb-a593-e3ec148a3f3b",
                "startTimestamp": 1705687080000,
                "endTimestamp": 1705689240000
                },
                {
                "customerId": 5481,
                "callId": "89642d72-4f56-418c-823a-d2afdd7fbde4",
                "startTimestamp": 1705320780000,
                "endTimestamp": 1705321680000
                },
                {
                "customerId": 34481,
                "callId": "6bc34258-c2bb-4e1c-8d2a-47b3514c3f3e",
                "startTimestamp": 1705268160000,
                "endTimestamp": 1705271760000
                },
                {
                "customerId": 94631,
                "callId": "cf9c669c-10b3-4b10-9c9a-4e4bdaf10564",
                "startTimestamp": 1705144740000,
                "endTimestamp": 1705151400000
                },
                {
                "customerId": 34481,
                "callId": "d0cd50c4-c7a8-42b8-b860-baa2bacef944",
                "startTimestamp": 1705058280000,
                "endTimestamp": 1705064940000
                },
                {
                "customerId": 66230,
                "callId": "22152847-4a8e-481e-b9a7-e76a1b235511",
                "startTimestamp": 1704885240000,
                "endTimestamp": 1704891900000
                },
                {
                "customerId": 94631,
                "callId": "270fade5-11ee-42bf-afa8-1146a7597d9a",
                "startTimestamp": 1705234560000,
                "endTimestamp": 1705237260000
                },
                {
                "customerId": 11106,
                "callId": "59e3c1c3-4386-4fb8-8365-a0bfb6490ca7",
                "startTimestamp": 1705613940000,
                "endTimestamp": 1705617540000
                },
                {
                "customerId": 20205,
                "callId": "8a1e32ed-7f06-4951-a72d-d59ee3c0c133",
                "startTimestamp": 1705579860000,
                "endTimestamp": 1705580760000
                },
                {
                "customerId": 5481,
                "callId": "d8ebc389-4e7a-43a2-b8a4-ecc72342ada8",
                "startTimestamp": 1705321200000,
                "endTimestamp": 1705323900000
                },
                {
                "customerId": 75699,
                "callId": "30cd9e20-8aa5-4780-a20c-209547aebef3",
                "startTimestamp": 1705252500000,
                "endTimestamp": 1705255380000
                },
                {
                "customerId": 11106,
                "callId": "a95f6522-ebcb-4823-995e-ae8a64379f3d",
                "startTimestamp": 1705601820000,
                "endTimestamp": 1705607400000
                },
                {
                "customerId": 66230,
                "callId": "446cdae6-c6cd-4465-95fc-1905a89b98cf",
                "startTimestamp": 1705095180000,
                "endTimestamp": 1705098780000
                },
                {
                "customerId": 5481,
                "callId": "091c91d4-ca39-4ca8-b4a1-bdf09cb469ef",
                "startTimestamp": 1705046880000,
                "endTimestamp": 1705049580000
                },
                {
                "customerId": 66230,
                "callId": "a0321c14-e1ed-46a1-83a9-803d51c09122",
                "startTimestamp": 1704878160000,
                "endTimestamp": 1704879840000
                },
                {
                "customerId": 5481,
                "callId": "82ab24d7-341a-4be7-bc8e-474796377ac8",
                "startTimestamp": 1705428540000,
                "endTimestamp": 1705434120000
                },
                {
                "customerId": 11106,
                "callId": "e9d45483-41e7-4bab-9c47-72e682e621c7",
                "startTimestamp": 1705397040000,
                "endTimestamp": 1705398720000
                },
                {
                "customerId": 74348,
                "callId": "449fe641-e2da-488a-99e5-1a061b33d4b9",
                "startTimestamp": 1705514280000,
                "endTimestamp": 1705516440000
                },
                {
                "customerId": 4950,
                "callId": "30a3fa6b-49cd-4dda-abc5-b64ee44f945e",
                "startTimestamp": 1704971700000,
                "endTimestamp": 1704978360000
                },
                {
                "customerId": 20205,
                "callId": "ce60256f-b9c7-49de-a271-5cf7e3f7a25d",
                "startTimestamp": 1705580460000,
                "endTimestamp": 1705583160000
                },
                {
                "customerId": 20205,
                "callId": "cb9acb7f-0f59-4c0f-a645-c32267f873ad",
                "startTimestamp": 1705687920000,
                "endTimestamp": 1705693500000
                },
                {
                "customerId": 20205,
                "callId": "f41569cd-7f64-494f-bd69-7a0021121c4f",
                "startTimestamp": 1705490520000,
                "endTimestamp": 1705497180000
                },
                {
                "customerId": 74348,
                "callId": "338fa978-1126-4b91-91d3-92f21c96528a",
                "startTimestamp": 1705515300000,
                "endTimestamp": 1705520880000
                },
                {
                "customerId": 5481,
                "callId": "59d6183c-bcf1-4b5c-97a0-b33918282eeb",
                "startTimestamp": 1705441080000,
                "endTimestamp": 1705444680000
                },
                {
                "customerId": 94631,
                "callId": "ff6ba034-2790-4be1-82e7-907ee7ea7e10",
                "startTimestamp": 1705342260000,
                "endTimestamp": 1705347840000
                },
                {
                "customerId": 94631,
                "callId": "d687c8ed-4256-4276-9f7c-ba8f740b8221",
                "startTimestamp": 1705341240000,
                "endTimestamp": 1705343400000
                },
                {
                "customerId": 20205,
                "callId": "d89adec7-fd0d-4a6e-881e-e09694e52312",
                "startTimestamp": 1705306140000,
                "endTimestamp": 1705308840000
                },
                {
                "customerId": 5481,
                "callId": "1c2c44e7-31fd-4e07-abd5-16a815b4dd5d",
                "startTimestamp": 1705224120000,
                "endTimestamp": 1705225800000
                },
                {
                "customerId": 4950,
                "callId": "f4cd839c-e519-444a-a516-7f565c2178fd",
                "startTimestamp": 1705061220000,
                "endTimestamp": 1705062120000
                },
                {
                "customerId": 5481,
                "callId": "5a957fb8-e3af-4f29-810d-ebbb6c326c29",
                "startTimestamp": 1705428780000,
                "endTimestamp": 1705434360000
                },
                {
                "customerId": 5481,
                "callId": "668a82d3-f262-4086-beea-223e117e2ab8",
                "startTimestamp": 1705224000000,
                "endTimestamp": 1705225680000
                },
                {
                "customerId": 4950,
                "callId": "181094bb-4d80-49e7-9754-31878db66009",
                "startTimestamp": 1704971580000,
                "endTimestamp": 1704978240000
                },
                {
                "customerId": 5481,
                "callId": "cfdc8a9b-d504-42f7-bb21-a2e44b118cf1",
                "startTimestamp": 1705047120000,
                "endTimestamp": 1705049820000
                },
                {
                "customerId": 20205,
                "callId": "53feaf0f-68a8-4aa5-bf78-193711751c63",
                "startTimestamp": 1705579800000,
                "endTimestamp": 1705580700000
                },
                {
                "customerId": 4950,
                "callId": "bd49afbe-0c01-469b-95b4-fb803cef1254",
                "startTimestamp": 1705169160000,
                "endTimestamp": 1705174740000
                },
                {
                "customerId": 34481,
                "callId": "516c1a39-fb54-4740-944e-c85cfb928f23",
                "startTimestamp": 1705058220000,
                "endTimestamp": 1705064880000
                },
                {
                "customerId": 74348,
                "callId": "bb0f75b0-2122-4bdb-b432-ef22eb161e87",
                "startTimestamp": 1705515000000,
                "endTimestamp": 1705520580000
                },
                {
                "customerId": 34481,
                "callId": "2cf1f717-3f93-48ad-9e39-4f78c4e1aee1",
                "startTimestamp": 1705147500000,
                "endTimestamp": 1705148400000
                },
                {
                "customerId": 94631,
                "callId": "a7252646-9ef8-44fb-971b-d579a4ff9788",
                "startTimestamp": 1705234740000,
                "endTimestamp": 1705237440000
                },
                {
                "customerId": 94631,
                "callId": "72fef300-284a-4215-ac79-d525316e06c1",
                "startTimestamp": 1705354500000,
                "endTimestamp": 1705358100000
                },
                {
                "customerId": 94631,
                "callId": "c269b510-03d5-4ecf-aa94-b705ae4185db",
                "startTimestamp": 1705354680000,
                "endTimestamp": 1705358280000
                },
                {
                "customerId": 20205,
                "callId": "c97cbcc4-7fc0-4e2a-a897-cc3807155e58",
                "startTimestamp": 1705580820000,
                "endTimestamp": 1705583520000
                },
                {
                "customerId": 74348,
                "callId": "d7350c08-c9f4-45c2-9a61-3cac3e4526da",
                "startTimestamp": 1705310640000,
                "endTimestamp": 1705312320000
                },
                {
                "customerId": 11106,
                "callId": "d8cde64e-3225-4a8d-bbce-7d75aa45a169",
                "startTimestamp": 1705397160000,
                "endTimestamp": 1705398840000
                },
                {
                "customerId": 5481,
                "callId": "c0a426a4-752a-4af8-abd9-b8c0f9ce7ddd",
                "startTimestamp": 1705441020000,
                "endTimestamp": 1705444620000
                },
                {
                "customerId": 20205,
                "callId": "811c5ce5-7cb4-4a34-936f-3a9093b4bb9b",
                "startTimestamp": 1705306560000,
                "endTimestamp": 1705309260000
                },
                {
                "customerId": 11106,
                "callId": "85762def-772e-4243-82bf-39b5c1df1863",
                "startTimestamp": 1705494120000,
                "endTimestamp": 1705496820000
                },
                {
                "customerId": 20205,
                "callId": "4be06bf3-ef88-4210-acdd-97e6fbe6e040",
                "startTimestamp": 1705687200000,
                "endTimestamp": 1705689360000
                },
                {
                "customerId": 20205,
                "callId": "c533d9e0-c985-4b47-85f9-86e5c21d1893",
                "startTimestamp": 1705306620000,
                "endTimestamp": 1705309320000
                },
                {
                "customerId": 94631,
                "callId": "f2480beb-a8f7-4b51-9a1f-5965e006c3d1",
                "startTimestamp": 1705234020000,
                "endTimestamp": 1705234920000
                },
                {
                "customerId": 74348,
                "callId": "0904ee47-7be5-4be9-945a-5355eea0ee19",
                "startTimestamp": 1705514040000,
                "endTimestamp": 1705516200000
                },
                {
                "customerId": 66230,
                "callId": "119486ca-31c1-4f71-abd3-4546d1355fc9",
                "startTimestamp": 1704974640000,
                "endTimestamp": 1704975540000
                },
                {
                "customerId": 66230,
                "callId": "9c2a7774-02e4-4c2f-958e-934da5ccd566",
                "startTimestamp": 1704975120000,
                "endTimestamp": 1704977820000
                },
                {
                "customerId": 66230,
                "callId": "0172cd24-8447-442d-a082-099e0dceb783",
                "startTimestamp": 1704885120000,
                "endTimestamp": 1704891780000
                },
                {
                "customerId": 94631,
                "callId": "f24b7303-7e52-4a74-8df4-568224836d58",
                "startTimestamp": 1705234800000,
                "endTimestamp": 1705237500000
                },
                {
                "customerId": 11106,
                "callId": "e193e19a-3157-42ee-9729-8c080afe3cae",
                "startTimestamp": 1705219680000,
                "endTimestamp": 1705222380000
                },
                {
                "customerId": 75699,
                "callId": "145430a7-fcc6-49bf-8be8-881fa2f71e81",
                "startTimestamp": 1705357800000,
                "endTimestamp": 1705408200000
                },
                {
                "customerId": 4950,
                "callId": "720be6ad-3298-4f6c-a69c-db9ea50f4fe6",
                "startTimestamp": 1705168200000,
                "endTimestamp": 1705170360000
                },
                {
                "customerId": 74348,
                "callId": "97c9257b-9db9-40e5-9d44-591da9638686",
                "startTimestamp": 1705407780000,
                "endTimestamp": 1705410480000
                },
                {
                "customerId": 34481,
                "callId": "4a1b21f3-cdab-4a9e-abe7-be71c87a68b8",
                "startTimestamp": 1704873960000,
                "endTimestamp": 1704876660000
                },
                {
                "customerId": 11106,
                "callId": "f149362a-4524-4409-bdaf-0e1e327c6e67",
                "startTimestamp": 1705493700000,
                "endTimestamp": 1705494600000
                },
                {
                "customerId": 75699,
                "callId": "8dbefb5a-ea80-4ba1-b853-267d6db5c17f",
                "startTimestamp": 1705417920000,
                "endTimestamp": 1705425420000
                },
                {
                "customerId": 34481,
                "callId": "fa916d26-d845-43a1-9d9c-1c818b1f6a3d",
                "startTimestamp": 1705051260000,
                "endTimestamp": 1705052940000
                },
                {
                "customerId": 20205,
                "callId": "7f5d0728-3529-401c-8046-c81a41792736",
                "startTimestamp": 1705687380000,
                "endTimestamp": 1705689540000
                },
                {
                "customerId": 20205,
                "callId": "4de68d65-7410-4399-8d6f-ea44d6db4466",
                "startTimestamp": 1705580160000,
                "endTimestamp": 1705581060000
                },
                {
                "customerId": 5481,
                "callId": "64792adb-9311-4e5e-8314-2a045f76e4ff",
                "startTimestamp": 1705231080000,
                "endTimestamp": 1705237740000
                },
                {
                "customerId": 34481,
                "callId": "16fd5b56-dc86-4421-896d-92921ba263c1",
                "startTimestamp": 1705147620000,
                "endTimestamp": 1705148520000
                },
                {
                "customerId": 20205,
                "callId": "ef58e9de-1f46-4044-9c0c-7f58acec0ba0",
                "startTimestamp": 1705700400000,
                "endTimestamp": 1705704000000
                },
                {
                "customerId": 75699,
                "callId": "499241c4-802d-4a69-b954-364956430370",
                "startTimestamp": 1705503600000,
                "endTimestamp": 1705510800000
                },
                {
                "customerId": 11106,
                "callId": "59d64be7-0527-42d0-8b98-ac1cec033c75",
                "startTimestamp": 1705493820000,
                "endTimestamp": 1705494720000
                },
                {
                "customerId": 74348,
                "callId": "b2f4168b-634b-4092-998c-ca82b73a4853",
                "startTimestamp": 1705514160000,
                "endTimestamp": 1705516320000
                },
                {
                "customerId": 11106,
                "callId": "99623c60-c92f-4f37-9cc2-9e0894142efb",
                "startTimestamp": 1705493580000,
                "endTimestamp": 1705494480000
                },
                {
                "customerId": 5481,
                "callId": "3b041ffb-f1de-4889-b1d2-635d5ee2d1ca",
                "startTimestamp": 1705047000000,
                "endTimestamp": 1705049700000
                },
                {
                "customerId": 75699,
                "callId": "55625748-c10a-4c33-9afe-e86a5f5dd7fb",
                "startTimestamp": 1705239900000,
                "endTimestamp": 1705240500000
                },
                {
                "customerId": 34481,
                "callId": "05f8fde2-e4d5-42fd-8d94-00c5f99a3dab",
                "startTimestamp": 1705255620000,
                "endTimestamp": 1705261200000
                },
                {
                "customerId": 66230,
                "callId": "fc8b0cff-81b9-49ff-8bc5-2f21cf47f9ee",
                "startTimestamp": 1704885180000,
                "endTimestamp": 1704891840000
                },
                {
                "customerId": 34481,
                "callId": "d94689c5-b7ce-4ee7-a850-6abe98364ed6",
                "startTimestamp": 1705058160000,
                "endTimestamp": 1705064820000
                },
                {
                "customerId": 20205,
                "callId": "8f46ba8e-e9cb-43d9-96ac-a33fa7646dc5",
                "startTimestamp": 1705490640000,
                "endTimestamp": 1705497300000
                },
                {
                "customerId": 5481,
                "callId": "04354817-1f37-4534-9273-7dc68ac135ec",
                "startTimestamp": 1705441260000,
                "endTimestamp": 1705444860000
                },
                {
                "customerId": 4950,
                "callId": "17d7e0ed-8d8d-4a6a-afd8-7c7ee06e50e1",
                "startTimestamp": 1705181700000,
                "endTimestamp": 1705185300000
                },
                {
                "customerId": 20205,
                "callId": "4cc8c543-6b4f-4faf-bcec-a19e1c57fb7e",
                "startTimestamp": 1705700700000,
                "endTimestamp": 1705704300000
                },
                {
                "customerId": 20205,
                "callId": "71f03cf9-1d16-49cd-a4f7-9c82db886e42",
                "startTimestamp": 1705306380000,
                "endTimestamp": 1705309080000
                },
                {
                "customerId": 20205,
                "callId": "0bb52fb8-f0c0-463c-ab52-0ed5fa2fb7a4",
                "startTimestamp": 1705700640000,
                "endTimestamp": 1705704240000
                },
                {
                "customerId": 34481,
                "callId": "0566b6d1-d14f-4084-9afc-042cc77fd8fa",
                "startTimestamp": 1705148280000,
                "endTimestamp": 1705150980000
                },
                {
                "customerId": 53596,
                "callId": "53b4a973-7cbe-4565-bb68-b49c4f5ce73c",
                "startTimestamp": 1704614520000,
                "endTimestamp": 1704617220000
                },
                {
                "customerId": 74348,
                "callId": "9a843d94-b8f7-42b6-a27c-820c69a3a2f9",
                "startTimestamp": 1705310580000,
                "endTimestamp": 1705312260000
                },
                {
                "customerId": 20205,
                "callId": "a51f11a7-4e00-4b8c-b116-5fafd0dbe0fe",
                "startTimestamp": 1705483380000,
                "endTimestamp": 1705485060000
                },
                {
                "customerId": 5481,
                "callId": "31c1be59-ffa3-4f0e-b0f5-3112d4752c16",
                "startTimestamp": 1705428420000,
                "endTimestamp": 1705434000000
                },
                {
                "customerId": 4950,
                "callId": "f5aae679-a781-43be-877b-7cae6a577775",
                "startTimestamp": 1705061100000,
                "endTimestamp": 1705062000000
                },
                {
                "customerId": 4950,
                "callId": "e9c859e5-f14c-4452-9265-07526023c817",
                "startTimestamp": 1704787440000,
                "endTimestamp": 1704790140000
                },
                {
                "customerId": 74348,
                "callId": "3253a442-5294-47b3-814e-5e880304f38e",
                "startTimestamp": 1705407060000,
                "endTimestamp": 1705407960000
                },
                {
                "customerId": 94631,
                "callId": "b6f11ffc-4821-4818-8024-7e15bbd237b2",
                "startTimestamp": 1705234680000,
                "endTimestamp": 1705237380000
                },
                {
                "customerId": 20205,
                "callId": "b5f02297-9b6d-460f-b918-0e9daff8fb04",
                "startTimestamp": 1705688340000,
                "endTimestamp": 1705693920000
                },
                {
                "customerId": 5481,
                "callId": "9ba2b0f3-5d11-487a-824e-6f0a2857ec2c",
                "startTimestamp": 1705320420000,
                "endTimestamp": 1705321320000
                },
                {
                "customerId": 94631,
                "callId": "5fbd7578-6cf6-4315-a604-80276c21dbf6",
                "startTimestamp": 1705144680000,
                "endTimestamp": 1705151340000
                },
                {
                "customerId": 11106,
                "callId": "6663ed7f-4f8a-4e8d-bbf0-bebba5334cf7",
                "startTimestamp": 1705601580000,
                "endTimestamp": 1705607160000
                },
                {
                "customerId": 62060,
                "callId": "e87d5e23-acf7-4b3f-abf3-f87936496a99",
                "startTimestamp": 1704922200000,
                "endTimestamp": 1704925800000
                },
                {
                "customerId": 74348,
                "callId": "ff489637-1ba1-439c-8ce8-c90398978dd8",
                "startTimestamp": 1705514100000,
                "endTimestamp": 1705516260000
                },
                {
                "customerId": 94631,
                "callId": "37bbaea6-b65f-4cde-ad20-a15f76c7ef1c",
                "startTimestamp": 1705341300000,
                "endTimestamp": 1705343460000
                },
                {
                "customerId": 5481,
                "callId": "b0463743-592b-42a9-8fc3-2f4c818d3963",
                "startTimestamp": 1705224300000,
                "endTimestamp": 1705225980000
                },
                {
                "customerId": 74348,
                "callId": "64027789-a381-4f9e-ad0d-e14d2684b9fa",
                "startTimestamp": 1705317660000,
                "endTimestamp": 1705324320000
                },
                {
                "customerId": 53596,
                "callId": "fae27d32-ee30-4c81-b68d-6da6663b8e8c",
                "startTimestamp": 1704995220000,
                "endTimestamp": 1704997380000
                },
                {
                "customerId": 11106,
                "callId": "b78991fe-4974-4a6c-a417-aa74e85b6c9e",
                "startTimestamp": 1705493520000,
                "endTimestamp": 1705494420000
                },
                {
                "customerId": 4950,
                "callId": "60a596cb-83c3-4fb3-8418-f84fc4f4ef85",
                "startTimestamp": 1705061160000,
                "endTimestamp": 1705062060000
                },
                {
                "customerId": 34481,
                "callId": "f0d3aaf5-9150-4590-9fc5-bac9b5a479ce",
                "startTimestamp": 1705058100000,
                "endTimestamp": 1705064760000
                },
                {
                "customerId": 94631,
                "callId": "43e3672f-8d56-4879-ac8a-67980fcf40da",
                "startTimestamp": 1704960420000,
                "endTimestamp": 1704963120000
                },
                {
                "customerId": 74348,
                "callId": "250bc2b2-5e06-4ea3-a540-d36ebbe5ec68",
                "startTimestamp": 1705527480000,
                "endTimestamp": 1705531080000
                },
                {
                "customerId": 66230,
                "callId": "31eb30ad-490d-493e-a61a-f26f58e1e0ec",
                "startTimestamp": 1705082700000,
                "endTimestamp": 1705088280000
                },
                {
                "customerId": 75699,
                "callId": "dc43bbe7-a898-46b6-8b29-51a905877a18",
                "startTimestamp": 1705066560000,
                "endTimestamp": 1705067760000
                },
                {
                "customerId": 20205,
                "callId": "b813474d-bc32-4005-8732-c61e110bdea6",
                "startTimestamp": 1705579920000,
                "endTimestamp": 1705580820000
                },
                {
                "customerId": 34481,
                "callId": "8b1df029-0d2d-4464-acb7-7b462c72f538",
                "startTimestamp": 1705254780000,
                "endTimestamp": 1705256940000
                },
                {
                "customerId": 11106,
                "callId": "f2ddd150-4b3c-4881-bd6f-a37e5358627d",
                "startTimestamp": 1705403940000,
                "endTimestamp": 1705410600000
                },
                {
                "customerId": 20205,
                "callId": "db62b5eb-291c-4a5a-a556-c3fc06e95e49",
                "startTimestamp": 1705580880000,
                "endTimestamp": 1705583580000
                },
                {
                "customerId": 53596,
                "callId": "f21ba37c-7c7d-4382-b04b-f75269297c73",
                "startTimestamp": 1705008660000,
                "endTimestamp": 1705012260000
                },
                {
                "customerId": 5481,
                "callId": "8090c707-49bf-4409-a235-396d3138856e",
                "startTimestamp": 1705224240000,
                "endTimestamp": 1705225920000
                },
                {
                "customerId": 20205,
                "callId": "d9896e25-04a1-4835-8be1-1550a69b9f40",
                "startTimestamp": 1705580640000,
                "endTimestamp": 1705583340000
                },
                {
                "customerId": 94631,
                "callId": "61d63f3d-9df0-43e1-b857-fd6ef783871d",
                "startTimestamp": 1705144620000,
                "endTimestamp": 1705151280000
                },
                {
                "customerId": 11106,
                "callId": "efdd2bbf-4653-4832-ba26-3c0d9c75c732",
                "startTimestamp": 1705614120000,
                "endTimestamp": 1705617720000
                },
                {
                "customerId": 94631,
                "callId": "9f348790-7a7f-4bc5-8333-208ce8f4eb03",
                "startTimestamp": 1704960300000,
                "endTimestamp": 1704963000000
                },
                {
                "customerId": 75699,
                "callId": "6fe84d78-4774-4cee-a0d9-0d4e80b70312",
                "startTimestamp": 1705601520000,
                "endTimestamp": 1705622400000
                },
                {
                "customerId": 74348,
                "callId": "049584bd-9d52-4b32-bd74-6ebd54f57bde",
                "startTimestamp": 1705527840000,
                "endTimestamp": 1705531440000
                },
                {
                "customerId": 11106,
                "callId": "d42ee84b-8b71-4b18-aff8-ad4828f724ec",
                "startTimestamp": 1705219860000,
                "endTimestamp": 1705222560000
                },
                {
                "customerId": 74348,
                "callId": "2dfc4f37-6d6a-4bfc-8cac-7cf06c961e99",
                "startTimestamp": 1705133400000,
                "endTimestamp": 1705136100000
                },
                {
                "customerId": 20205,
                "callId": "6c05f1ff-c4ce-440b-8a50-2c3222b4e0db",
                "startTimestamp": 1705686840000,
                "endTimestamp": 1705689000000
                },
                {
                "customerId": 74348,
                "callId": "42f953b4-cecd-4b07-b3fa-13ba773f3adb",
                "startTimestamp": 1705527420000,
                "endTimestamp": 1705531020000
                },
                {
                "customerId": 5481,
                "callId": "eab568fa-5d2f-4235-8166-9160d457a024",
                "startTimestamp": 1705046760000,
                "endTimestamp": 1705049460000
                },
                {
                "customerId": 94631,
                "callId": "8a5b65d5-29c5-45ed-be88-f5580de3772b",
                "startTimestamp": 1704960360000,
                "endTimestamp": 1704963060000
                },
                {
                "customerId": 74348,
                "callId": "da007501-c2b3-4561-8920-d6fa762f588b",
                "startTimestamp": 1705407540000,
                "endTimestamp": 1705410240000
                },
                {
                "customerId": 62060,
                "callId": "4950e360-e815-418d-beec-4689c036b0b8",
                "startTimestamp": 1704712200000,
                "endTimestamp": 1704718860000
                },
                {
                "customerId": 11106,
                "callId": "f508aae4-e54d-4100-85e8-870cf136a694",
                "startTimestamp": 1705600560000,
                "endTimestamp": 1705602720000
                },
                {
                "customerId": 11106,
                "callId": "7d0f1c3a-67fb-4476-8cfb-5e27d37e55f6",
                "startTimestamp": 1705494180000,
                "endTimestamp": 1705496880000
                },
                {
                "customerId": 20205,
                "callId": "c97b7857-0b73-41e5-8dc3-ca36d33a6e37",
                "startTimestamp": 1705688160000,
                "endTimestamp": 1705693740000
                },
                {
                "customerId": 74348,
                "callId": "7c7f025e-23bf-44fb-8489-192a4c3fc17b",
                "startTimestamp": 1705515240000,
                "endTimestamp": 1705520820000
                },
                {
                "customerId": 20205,
                "callId": "622ce75f-2af8-4042-aa85-c42a4a7e852f",
                "startTimestamp": 1705306320000,
                "endTimestamp": 1705309020000
                },
                {
                "customerId": 4950,
                "callId": "78e4f217-f6ab-49c3-9b61-e98f7931f7ff",
                "startTimestamp": 1705061580000,
                "endTimestamp": 1705064280000
                },
                {
                "customerId": 11106,
                "callId": "7b1cdd35-6937-457e-8cc6-f268f052b698",
                "startTimestamp": 1705614180000,
                "endTimestamp": 1705617780000
                },
                {
                "customerId": 11106,
                "callId": "1e58ec09-79c7-494f-8fee-17cd76ffb3d5",
                "startTimestamp": 1705220160000,
                "endTimestamp": 1705222860000
                },
                {
                "customerId": 11106,
                "callId": "0c18883d-68b8-41fe-9b76-82e7cda8464a",
                "startTimestamp": 1705494360000,
                "endTimestamp": 1705497060000
                },
                {
                "customerId": 74348,
                "callId": "51434344-eab8-42fb-9706-995dea3bc931",
                "startTimestamp": 1705407600000,
                "endTimestamp": 1705410300000
                },
                {
                "customerId": 53596,
                "callId": "f925fc45-d06c-4aa3-88d4-5045c3d45d3e",
                "startTimestamp": 1704798660000,
                "endTimestamp": 1704805320000
                },
                {
                "customerId": 94631,
                "callId": "db3a1575-f2f7-42f6-8d48-31d3e54285de",
                "startTimestamp": 1705144800000,
                "endTimestamp": 1705151460000
                },
                {
                "customerId": 74348,
                "callId": "e64dc715-cfa4-4df4-a1df-67097711d961",
                "startTimestamp": 1705133640000,
                "endTimestamp": 1705136340000
                },
                {
                "customerId": 20205,
                "callId": "f6ac8c57-90e7-4952-845d-d750f5592499",
                "startTimestamp": 1705700580000,
                "endTimestamp": 1705704180000
                },
                {
                "customerId": 94631,
                "callId": "fbfe57e3-d483-4d00-ae3d-cc2f4cdd3310",
                "startTimestamp": 1704960540000,
                "endTimestamp": 1704963240000
                },
                {
                "customerId": 4950,
                "callId": "7712a421-8d7a-4b3d-840b-bb9b66e131df",
                "startTimestamp": 1704971640000,
                "endTimestamp": 1704978300000
                },
                {
                "customerId": 20205,
                "callId": "ee6e84d6-3612-4f4a-bc35-edf541fc68eb",
                "startTimestamp": 1705483800000,
                "endTimestamp": 1705485480000
                },
                {
                "customerId": 74348,
                "callId": "2be93304-6980-4413-ba2b-987b62f5cd1e",
                "startTimestamp": 1705133460000,
                "endTimestamp": 1705136160000
                },
                {
                "customerId": 4950,
                "callId": "3ab38c56-a282-4498-82c6-4383a3411919",
                "startTimestamp": 1704964620000,
                "endTimestamp": 1704966300000
                },
                {
                "customerId": 53596,
                "callId": "0ddec52d-6028-4d8d-acf5-93233a1f6430",
                "startTimestamp": 1704888180000,
                "endTimestamp": 1704889080000
                },
                {
                "customerId": 66230,
                "callId": "e6d78cd2-9e36-43fb-84cc-eec83a2eb403",
                "startTimestamp": 1705081620000,
                "endTimestamp": 1705083780000
                },
                {
                "customerId": 11106,
                "callId": "801d5b0b-d3f2-41ae-924e-0bad8f73fa6a",
                "startTimestamp": 1705600500000,
                "endTimestamp": 1705602660000
                },
                {
                "customerId": 74348,
                "callId": "83edada3-b4f9-4c00-9728-e7b7458cf3f8",
                "startTimestamp": 1705133520000,
                "endTimestamp": 1705136220000
                },
                {
                "customerId": 94631,
                "callId": "79694f04-62ff-4d66-bf80-13000557d68c",
                "startTimestamp": 1705342020000,
                "endTimestamp": 1705347600000
                },
                {
                "customerId": 74348,
                "callId": "0c49e26b-f507-4bac-8b93-ee4709faecbc",
                "startTimestamp": 1705317720000,
                "endTimestamp": 1705324380000
                },
                {
                "customerId": 74348,
                "callId": "b2237f1b-10ab-4c52-9ca8-4f2aa4d8b624",
                "startTimestamp": 1705317600000,
                "endTimestamp": 1705324260000
                },
                {
                "customerId": 5481,
                "callId": "c3c8495e-7797-46d8-a871-8c42f2a97591",
                "startTimestamp": 1705231200000,
                "endTimestamp": 1705237860000
                },
                {
                "customerId": 20205,
                "callId": "341f575b-dfec-41e0-a050-745a2b9bc698",
                "startTimestamp": 1705580340000,
                "endTimestamp": 1705583040000
                },
                {
                "customerId": 5481,
                "callId": "f432c7c6-6896-4d8a-a826-f58c408bf1f1",
                "startTimestamp": 1705427700000,
                "endTimestamp": 1705429860000
                },
                {
                "customerId": 53596,
                "callId": "2a4a0ad4-1458-4857-ad34-bfa41e3183d9",
                "startTimestamp": 1704888120000,
                "endTimestamp": 1704889020000
                },
                {
                "customerId": 74348,
                "callId": "4c7f1bee-5280-4948-b00d-4c9b2f4c2c62",
                "startTimestamp": 1705317540000,
                "endTimestamp": 1705324200000
                },
                {
                "customerId": 20205,
                "callId": "7795ddc4-cf4a-4a22-9f1f-b5f4715c0481",
                "startTimestamp": 1705580280000,
                "endTimestamp": 1705581180000
                },
                {
                "customerId": 34481,
                "callId": "bee40441-05b9-4218-b422-bebd6db42e30",
                "startTimestamp": 1705255680000,
                "endTimestamp": 1705261260000
                },
                {
                "customerId": 11106,
                "callId": "7976730d-e5d1-401c-8f63-394904dd827c",
                "startTimestamp": 1705600800000,
                "endTimestamp": 1705602960000
                },
                {
                "customerId": 20205,
                "callId": "0fc5582e-2a01-4ba7-99aa-230e04dc11dd",
                "startTimestamp": 1705580100000,
                "endTimestamp": 1705581000000
                },
                {
                "customerId": 11106,
                "callId": "09241850-770b-4ee9-8003-09c8fe352436",
                "startTimestamp": 1705601760000,
                "endTimestamp": 1705607340000
                },
                {
                "customerId": 5481,
                "callId": "e884316c-d44b-406c-b797-023ee3392d44",
                "startTimestamp": 1705321140000,
                "endTimestamp": 1705323840000
                },
                {
                "customerId": 20205,
                "callId": "3061dbbf-adc5-43e8-b3cc-b36929370f7c",
                "startTimestamp": 1705580580000,
                "endTimestamp": 1705583280000
                },
                {
                "customerId": 11106,
                "callId": "631d8ca6-3642-4f0f-ae54-3ca65db51740",
                "startTimestamp": 1705614060000,
                "endTimestamp": 1705617660000
                },
                {
                "customerId": 20205,
                "callId": "b4953615-abe9-4a24-ab57-7011fbdb7c7f",
                "startTimestamp": 1705483320000,
                "endTimestamp": 1705485000000
                },
                {
                "customerId": 20205,
                "callId": "d61b01cd-e788-4dc0-8440-0ba4a736709f",
                "startTimestamp": 1705688280000,
                "endTimestamp": 1705693860000
                },
                {
                "customerId": 20205,
                "callId": "8c62ef82-393b-475f-91c9-859705f136d9",
                "startTimestamp": 1705490880000,
                "endTimestamp": 1705497540000
                },
                {
                "customerId": 5481,
                "callId": "e1b5781f-a658-4cf0-a028-62b58069d08c",
                "startTimestamp": 1705320660000,
                "endTimestamp": 1705321560000
                },
                {
                "customerId": 74348,
                "callId": "e162a3d4-f4b8-4afa-844d-0128ad1f2dcd",
                "startTimestamp": 1705515060000,
                "endTimestamp": 1705520640000
                },
                {
                "customerId": 94631,
                "callId": "971acb0e-c32b-4f79-9beb-35c5ab0bd283",
                "startTimestamp": 1705144500000,
                "endTimestamp": 1705151160000
                },
                {
                "customerId": 94631,
                "callId": "76981458-5c38-4a07-934d-b0d0f9776d93",
                "startTimestamp": 1705234080000,
                "endTimestamp": 1705234980000
                },
                {
                "customerId": 11106,
                "callId": "6ad6e7df-1008-47eb-8430-21e21d5b7443",
                "startTimestamp": 1705600440000,
                "endTimestamp": 1705602600000
                },
                {
                "customerId": 4950,
                "callId": "8402a083-1d57-4443-9e72-62dc030b43ef",
                "startTimestamp": 1705061040000,
                "endTimestamp": 1705061940000
                },
                {
                "customerId": 74348,
                "callId": "d05cdbe3-c9e4-4ea0-be00-bcfc85864183",
                "startTimestamp": 1705407840000,
                "endTimestamp": 1705410540000
                },
                {
                "customerId": 5481,
                "callId": "34d02608-a95f-4103-a926-57a0447e5969",
                "startTimestamp": 1705441200000,
                "endTimestamp": 1705444800000
                },
                {
                "customerId": 34481,
                "callId": "fc03c216-bd8a-4b73-ab11-38a515b3dd4b",
                "startTimestamp": 1705254720000,
                "endTimestamp": 1705256880000
                },
                {
                "customerId": 74348,
                "callId": "aeae9b0c-d7af-435d-99ee-2bee78a475c4",
                "startTimestamp": 1705515120000,
                "endTimestamp": 1705520700000
                },
                {
                "customerId": 11106,
                "callId": "86891934-172a-466f-9254-48e673d79a34",
                "startTimestamp": 1705493940000,
                "endTimestamp": 1705496640000
                },
                {
                "customerId": 5481,
                "callId": "27518f93-28cc-40c3-b8e6-401e2220f852",
                "startTimestamp": 1705046940000,
                "endTimestamp": 1705049640000
                },
                {
                "customerId": 34481,
                "callId": "66244767-3ad6-4aa8-a6f1-03262bb8bc4d",
                "startTimestamp": 1705148220000,
                "endTimestamp": 1705150920000
                },
                {
                "customerId": 75699,
                "callId": "277c0023-24dc-4e38-9b20-f804aafad777",
                "startTimestamp": 1705355040000,
                "endTimestamp": 1705361640000
                },
                {
                "customerId": 74348,
                "callId": "4207d200-cef6-418f-8aaf-e32a75034b02",
                "startTimestamp": 1705310460000,
                "endTimestamp": 1705312140000
                },
                {
                "customerId": 5481,
                "callId": "290defa0-9eb2-4549-b656-cb32bc53c5a5",
                "startTimestamp": 1705320600000,
                "endTimestamp": 1705321500000
                },
                {
                "customerId": 11106,
                "callId": "f87bec5c-c661-4276-b01c-d2d5dcdac2a0",
                "startTimestamp": 1705219980000,
                "endTimestamp": 1705222680000
                },
                {
                "customerId": 20205,
                "callId": "c9819d48-0a17-4644-86de-dd3d20892390",
                "startTimestamp": 1705490820000,
                "endTimestamp": 1705497480000
                },
                {
                "customerId": 20205,
                "callId": "cbafc322-c0cb-44f8-82b8-c4d3396e16cf",
                "startTimestamp": 1705687140000,
                "endTimestamp": 1705689300000
                },
                {
                "customerId": 20205,
                "callId": "e30436ce-07df-4b08-8aa6-d0f49f0d86f1",
                "startTimestamp": 1705490460000,
                "endTimestamp": 1705497120000
                },
                {
                "customerId": 5481,
                "callId": "fe19e9ba-b5ac-474f-9328-e2ddc01f317f",
                "startTimestamp": 1705427760000,
                "endTimestamp": 1705429920000
                },
                {
                "customerId": 20205,
                "callId": "5783b67f-932f-453e-8cb2-bb22fddf86c4",
                "startTimestamp": 1705306440000,
                "endTimestamp": 1705309140000
                },
                {
                "customerId": 74348,
                "callId": "82f27b38-740a-4ac0-9e17-da85cba4b575",
                "startTimestamp": 1705513980000,
                "endTimestamp": 1705516140000
                },
                {
                "customerId": 11106,
                "callId": "d2e20623-edd2-4739-a75d-3d7b48da0824",
                "startTimestamp": 1705614000000,
                "endTimestamp": 1705617600000
                },
                {
                "customerId": 62060,
                "callId": "a287bd1f-c1f9-432b-b17a-5c1b33de8599",
                "startTimestamp": 1704908700000,
                "endTimestamp": 1704910860000
                },
                {
                "customerId": 34481,
                "callId": "41924a28-0478-455b-bfbb-05e9240a67af",
                "startTimestamp": 1705147680000,
                "endTimestamp": 1705148580000
                },
                {
                "customerId": 94631,
                "callId": "e6bae791-ac5a-47f4-80b4-2621ceba7137",
                "startTimestamp": 1705354560000,
                "endTimestamp": 1705358160000
                },
                {
                "customerId": 75699,
                "callId": "6cd9f03b-c902-4ec5-a6f1-760850f241a5",
                "startTimestamp": 1705503600000,
                "endTimestamp": 1705510800000
                },
                {
                "customerId": 5481,
                "callId": "8ca9717b-dccc-43b2-8a6f-1049bc4f4f36",
                "startTimestamp": 1705427820000,
                "endTimestamp": 1705429980000
                },
                {
                "customerId": 74348,
                "callId": "83d8ae54-0175-4871-9975-8877b1a82da1",
                "startTimestamp": 1705407720000,
                "endTimestamp": 1705410420000
                },
                {
                "customerId": 20205,
                "callId": "c6c1c768-0a6b-4632-8a97-e5d3c35109c8",
                "startTimestamp": 1705580400000,
                "endTimestamp": 1705583100000
                },
                {
                "customerId": 66230,
                "callId": "43c20484-0e4d-4c12-b6af-216f190f7d7a",
                "startTimestamp": 1704701040000,
                "endTimestamp": 1704703740000
                },
                {
                "customerId": 4950,
                "callId": "1e75bad1-d078-4979-83ef-3ed38cfa4a5c",
                "startTimestamp": 1705061700000,
                "endTimestamp": 1705064400000
                },
                {
                "customerId": 5481,
                "callId": "b0891487-76db-4b0f-81e9-1dc0226af7f4",
                "startTimestamp": 1705320540000,
                "endTimestamp": 1705321440000
                },
                {
                "customerId": 34481,
                "callId": "922781b1-8f49-431b-95bf-45796f3b4165",
                "startTimestamp": 1705254600000,
                "endTimestamp": 1705256760000
                },
                {
                "customerId": 74348,
                "callId": "c2e80b44-7fb1-44a4-896f-15a261e1b8ca",
                "startTimestamp": 1705515180000,
                "endTimestamp": 1705520760000
                },
                {
                "customerId": 5481,
                "callId": "f92ad343-31da-41a4-b590-a4faf3fac613",
                "startTimestamp": 1705427580000,
                "endTimestamp": 1705429740000
                },
                {
                "customerId": 20205,
                "callId": "9900c981-d919-404d-aa57-251e340cc9fc",
                "startTimestamp": 1705686900000,
                "endTimestamp": 1705689060000
                },
                {
                "customerId": 74348,
                "callId": "0e0d64e5-a989-47b6-8902-cd97d4cd0583",
                "startTimestamp": 1705407480000,
                "endTimestamp": 1705410180000
                },
                {
                "customerId": 20205,
                "callId": "7b54a218-0e14-4396-b891-4272815b467e",
                "startTimestamp": 1705490580000,
                "endTimestamp": 1705497240000
                },
                {
                "customerId": 94631,
                "callId": "acdd1e46-32e9-4ece-8336-824233c132ab",
                "startTimestamp": 1705354800000,
                "endTimestamp": 1705358400000
                },
                {
                "customerId": 66230,
                "callId": "a81a6896-6ea1-4156-8eba-0c8e07e008bb",
                "startTimestamp": 1704975180000,
                "endTimestamp": 1704977880000
                },
                {
                "customerId": 53596,
                "callId": "c1f7b2a3-ab73-4643-85c1-89e312e53fc5",
                "startTimestamp": 1704791700000,
                "endTimestamp": 1704793380000
                },
                {
                "customerId": 5481,
                "callId": "25f8085e-785e-452d-a4d6-f13d2b2de512",
                "startTimestamp": 1705320960000,
                "endTimestamp": 1705323660000
                },
                {
                "customerId": 74348,
                "callId": "ea6cb99b-d635-4541-a804-2e9d78234d77",
                "startTimestamp": 1705133280000,
                "endTimestamp": 1705135980000
                },
                {
                "customerId": 4950,
                "callId": "91d657eb-ad01-40b0-bcea-98aaae76244e",
                "startTimestamp": 1705181760000,
                "endTimestamp": 1705185360000
                },
                {
                "customerId": 94631,
                "callId": "609d8395-8479-407b-aa75-1f4c552e3fde",
                "startTimestamp": 1704960480000,
                "endTimestamp": 1704963180000
                },
                {
                "customerId": 74348,
                "callId": "e0f48df2-05d4-4642-919d-0770b47ac9af",
                "startTimestamp": 1705407420000,
                "endTimestamp": 1705410120000
                },
                {
                "customerId": 53596,
                "callId": "428485b1-7108-4684-92f8-125750b33971",
                "startTimestamp": 1704798720000,
                "endTimestamp": 1704805380000
                },
                {
                "customerId": 11106,
                "callId": "c8c76fc3-017f-4db6-93e4-e6fc02d933b9",
                "startTimestamp": 1705613880000,
                "endTimestamp": 1705617480000
                },
                {
                "customerId": 74348,
                "callId": "8e5d90a6-61e3-48d0-8d6f-658987e2d680",
                "startTimestamp": 1705514940000,
                "endTimestamp": 1705520520000
                },
                {
                "customerId": 5481,
                "callId": "4c184075-002e-403f-b1cd-27a32bac6593",
                "startTimestamp": 1705440960000,
                "endTimestamp": 1705444560000
                },
                {
                "customerId": 20205,
                "callId": "8af48b32-4559-4b93-baee-eda2597a0b69",
                "startTimestamp": 1705483440000,
                "endTimestamp": 1705485120000
                },
                {
                "customerId": 4950,
                "callId": "b372899e-7b85-4afc-b239-f9fa9478ecd8",
                "startTimestamp": 1704964740000,
                "endTimestamp": 1704966420000
                },
                {
                "customerId": 34481,
                "callId": "bc72635b-0269-443e-98ef-20a91cf42bf2",
                "startTimestamp": 1705255740000,
                "endTimestamp": 1705261320000
                },
                {
                "customerId": 5481,
                "callId": "c8d80e86-1c24-4dfe-926c-08f58bebe1aa",
                "startTimestamp": 1705428480000,
                "endTimestamp": 1705434060000
                },
                {
                "customerId": 11106,
                "callId": "a8a6206a-189e-4061-8b52-e251a9b2b532",
                "startTimestamp": 1705220040000,
                "endTimestamp": 1705222740000
                },
                {
                "customerId": 11106,
                "callId": "85c6c315-88dc-47f9-8a57-7c54702739d8",
                "startTimestamp": 1705601340000,
                "endTimestamp": 1705606920000
                },
                {
                "customerId": 4950,
                "callId": "e76be1ae-2e63-4922-86e7-69e673ecac35",
                "startTimestamp": 1704787380000,
                "endTimestamp": 1704790080000
                },
                {
                "customerId": 11106,
                "callId": "a649d8cc-cdea-47c8-816e-b79db60a0752",
                "startTimestamp": 1705403880000,
                "endTimestamp": 1705410540000
                },
                {
                "customerId": 34481,
                "callId": "e8035c1d-b9e3-45ff-8d35-bdf298c5b6e2",
                "startTimestamp": 1704874080000,
                "endTimestamp": 1704876780000
                },
                {
                "customerId": 34481,
                "callId": "71be4d55-34a7-4e5a-8b5a-1f7088c6fa95",
                "startTimestamp": 1705051080000,
                "endTimestamp": 1705052760000
                },
                {
                "customerId": 5481,
                "callId": "da370ab7-ad1c-4df4-a266-86d4a9689531",
                "startTimestamp": 1705224060000,
                "endTimestamp": 1705225740000
                },
                {
                "customerId": 11106,
                "callId": "56385691-35a6-44f8-9b1c-de186bf07dad",
                "startTimestamp": 1705493640000,
                "endTimestamp": 1705494540000
                },
                {
                "customerId": 5481,
                "callId": "ac08d62e-a0ce-4b60-8f90-9adb7aa5a273",
                "startTimestamp": 1705320720000,
                "endTimestamp": 1705321620000
                },
                {
                "customerId": 74348,
                "callId": "79dec285-500a-4646-9676-497c9ebcdccf",
                "startTimestamp": 1705513920000,
                "endTimestamp": 1705516080000
                },
                {
                "customerId": 34481,
                "callId": "eb0c4bd2-d36d-4f6c-a2f0-1ffbce541fdd",
                "startTimestamp": 1705268220000,
                "endTimestamp": 1705271820000
                },
                {
                "customerId": 20205,
                "callId": "5876a85a-e73a-428a-acae-05d0cea5a444",
                "startTimestamp": 1705306500000,
                "endTimestamp": 1705309200000
                },
                {
                "customerId": 94631,
                "callId": "bc2c8cd6-a68c-4660-b0c2-ea4a0f1212a4",
                "startTimestamp": 1705137540000,
                "endTimestamp": 1705139220000
                },
                {
                "customerId": 94631,
                "callId": "602cf799-a8a9-4735-8596-11c3b3bc4189",
                "startTimestamp": 1705233960000,
                "endTimestamp": 1705234860000
                },
                {
                "customerId": 94631,
                "callId": "4cd1602a-d6ae-46ea-832c-3a1e6f7745e9",
                "startTimestamp": 1705137600000,
                "endTimestamp": 1705139280000
                },
                {
                "customerId": 4950,
                "callId": "85fc2d18-3b5b-4c3f-8e26-c736b0a827b1",
                "startTimestamp": 1705168140000,
                "endTimestamp": 1705170300000
                },
                {
                "customerId": 20205,
                "callId": "d648fe9a-6546-4810-b921-a0699ee74b5d",
                "startTimestamp": 1705700460000,
                "endTimestamp": 1705704060000
                },
                {
                "customerId": 66230,
                "callId": "075a222f-fffa-41ff-a960-3df1bb9e5789",
                "startTimestamp": 1704975240000,
                "endTimestamp": 1704977940000
                },
                {
                "customerId": 74348,
                "callId": "9099e006-262d-4ff9-acb9-ac8e3704ed4c",
                "startTimestamp": 1705406880000,
                "endTimestamp": 1705407780000
                },
                {
                "customerId": 11106,
                "callId": "2f53ffe2-c5bb-43a5-943c-53d0f2927ec2",
                "startTimestamp": 1705493460000,
                "endTimestamp": 1705494360000
                },
                {
                "customerId": 5481,
                "callId": "b302f2fc-3451-41c0-904a-f454f8682e8a",
                "startTimestamp": 1705231320000,
                "endTimestamp": 1705237980000
                },
                {
                "customerId": 94631,
                "callId": "c67f4b6f-23f9-4d16-9fa1-fbe9f7ddaa01",
                "startTimestamp": 1705341000000,
                "endTimestamp": 1705343160000
                },
                {
                "customerId": 20205,
                "callId": "ffddeb95-75dc-4479-88b4-9d4f59b3f2b0",
                "startTimestamp": 1705580220000,
                "endTimestamp": 1705581120000
                },
                {
                "customerId": 75699,
                "callId": "6a5100ad-30cf-4b50-af53-2091b223aea2",
                "startTimestamp": 1705503600000,
                "endTimestamp": 1705510800000
                },
                {
                "customerId": 74348,
                "callId": "78a7986b-5822-4999-8079-74b00901be92",
                "startTimestamp": 1705514340000,
                "endTimestamp": 1705516500000
                },
                {
                "customerId": 75699,
                "callId": "147b0087-cc50-4bab-80ef-36c0bf4f2214",
                "startTimestamp": 1705072860000,
                "endTimestamp": 1705075260000
                },
                {
                "customerId": 34481,
                "callId": "c8b2e126-144f-47ff-b646-9998837ea5ab",
                "startTimestamp": 1705255560000,
                "endTimestamp": 1705261140000
                },
                {
                "customerId": 94631,
                "callId": "6697d267-0e2b-46c1-8bb1-aeda8c94885f",
                "startTimestamp": 1705144560000,
                "endTimestamp": 1705151220000
                },
                {
                "customerId": 20205,
                "callId": "28153374-456a-4990-80d2-283bd65f3467",
                "startTimestamp": 1705700520000,
                "endTimestamp": 1705704120000
                },
                {
                "customerId": 11106,
                "callId": "7f7f04e6-2035-4157-aaee-37d181badacb",
                "startTimestamp": 1705404060000,
                "endTimestamp": 1705410720000
                },
                {
                "customerId": 74348,
                "callId": "02906540-8aca-4adf-90ca-b9333fc8d7a4",
                "startTimestamp": 1705407240000,
                "endTimestamp": 1705408140000
                },
                {
                "customerId": 4950,
                "callId": "37b7d510-5f55-4ee8-930f-d0844a2d4cbc",
                "startTimestamp": 1704971760000,
                "endTimestamp": 1704978420000
                },
                {
                "customerId": 5481,
                "callId": "20b35ff1-3043-45ac-80fc-3a99c191f38b",
                "startTimestamp": 1705046820000,
                "endTimestamp": 1705049520000
                },
                {
                "customerId": 74348,
                "callId": "5a97b530-d3dc-4abd-a99a-e49ca61771ff",
                "startTimestamp": 1705527540000,
                "endTimestamp": 1705531140000
                },
                {
                "customerId": 11106,
                "callId": "4086abc4-93d3-4e1b-960b-2bf6833cd265",
                "startTimestamp": 1705493400000,
                "endTimestamp": 1705494300000
                },
                {
                "customerId": 74348,
                "callId": "21a055e4-4fac-449b-bd33-c0a58567710d",
                "startTimestamp": 1705317840000,
                "endTimestamp": 1705324500000
                },
                {
                "customerId": 5481,
                "callId": "1cf8338a-aeb7-463f-8606-17ef616cfdab",
                "startTimestamp": 1705441140000,
                "endTimestamp": 1705444740000
                },
                {
                "customerId": 20205,
                "callId": "b3539aca-c9c1-4b52-bfea-26518da4b8ff",
                "startTimestamp": 1705490700000,
                "endTimestamp": 1705497360000
                },
                {
                "customerId": 11106,
                "callId": "96e6fea5-9a7a-4284-8e97-89e572ed23cf",
                "startTimestamp": 1705397100000,
                "endTimestamp": 1705398780000
                },
                {
                "customerId": 11106,
                "callId": "86884335-2a20-4518-a379-e4c83c2eecf5",
                "startTimestamp": 1705493760000,
                "endTimestamp": 1705494660000
                },
                {
                "customerId": 94631,
                "callId": "6631b2e0-dcfa-465a-b5b0-22cec316864b",
                "startTimestamp": 1705342080000,
                "endTimestamp": 1705347660000
                },
                {
                "customerId": 11106,
                "callId": "a275e370-f8f9-4c9c-bc27-29d374c8a34d",
                "startTimestamp": 1705404180000,
                "endTimestamp": 1705410840000
                },
                {
                "customerId": 94631,
                "callId": "c0c94ab4-557f-407e-8b1e-19144dfd3d51",
                "startTimestamp": 1705137720000,
                "endTimestamp": 1705139400000
                },
                {
                "customerId": 74348,
                "callId": "a5149579-7875-4035-9648-30a9dadcba82",
                "startTimestamp": 1705133340000,
                "endTimestamp": 1705136040000
                },
                {
                "customerId": 20205,
                "callId": "cded4f4a-e430-4a38-947b-09f1c9cc3841",
                "startTimestamp": 1705490340000,
                "endTimestamp": 1705497000000
                },
                {
                "customerId": 11106,
                "callId": "6ca94861-4405-4b20-9c4a-913d0a5df456",
                "startTimestamp": 1705601400000,
                "endTimestamp": 1705606980000
                },
                {
                "customerId": 20205,
                "callId": "0c504b58-704b-461e-a203-83da2634705f",
                "startTimestamp": 1705306200000,
                "endTimestamp": 1705308900000
                },
                {
                "customerId": 20205,
                "callId": "9fd7d95a-c634-4611-bc71-53f80bfc1299",
                "startTimestamp": 1705700880000,
                "endTimestamp": 1705704480000
                },
                {
                "customerId": 11106,
                "callId": "9bbb5b1f-191b-446e-8f38-77810986d576",
                "startTimestamp": 1705601460000,
                "endTimestamp": 1705607040000
                },
                {
                "customerId": 20205,
                "callId": "76e1dcb2-9cec-48e8-ad2d-00e6a1aa6a7c",
                "startTimestamp": 1705688100000,
                "endTimestamp": 1705693680000
                },
                {
                "customerId": 34481,
                "callId": "3ab207d0-0cef-445e-897c-6a6f70562c90",
                "startTimestamp": 1705147740000,
                "endTimestamp": 1705148640000
                },
                {
                "customerId": 11106,
                "callId": "8db2a402-ed5d-4626-98c7-b746afd0e9af",
                "startTimestamp": 1705404240000,
                "endTimestamp": 1705410900000
                },
                {
                "customerId": 20205,
                "callId": "587657b2-b70e-4ea1-a95c-c8bb171a2366",
                "startTimestamp": 1705687020000,
                "endTimestamp": 1705689180000
                },
                {
                "customerId": 11106,
                "callId": "99608a24-90dd-443f-b7e4-8a5bfd8260b1",
                "startTimestamp": 1705600740000,
                "endTimestamp": 1705602900000
                },
                {
                "customerId": 34481,
                "callId": "2fbce912-14e5-4b18-a7a9-eff900fbc8aa",
                "startTimestamp": 1705148160000,
                "endTimestamp": 1705150860000
                },
                {
                "customerId": 4950,
                "callId": "e5d1f5bf-a35c-4811-ac06-8521f6de5a9a",
                "startTimestamp": 1704964680000,
                "endTimestamp": 1704966360000
                },
                {
                "customerId": 20205,
                "callId": "4d038fc3-40a3-46de-a5b2-e6781a3fb83d",
                "startTimestamp": 1705580700000,
                "endTimestamp": 1705583400000
                },
                {
                "customerId": 94631,
                "callId": "f9aaabad-6707-43fe-9f57-404d8916b7de",
                "startTimestamp": 1705137480000,
                "endTimestamp": 1705139160000
                },
                {
                "customerId": 11106,
                "callId": "fc2d7416-68b5-4bdd-a375-f8c23b8b27e1",
                "startTimestamp": 1705493340000,
                "endTimestamp": 1705494240000
                },
                {
                "customerId": 74348,
                "callId": "7eb8dc4f-9663-435b-b238-0d50a3a4e19a",
                "startTimestamp": 1705407660000,
                "endTimestamp": 1705410360000
                },
                {
                "customerId": 11106,
                "callId": "c3cb921a-dc27-447b-a6c4-7d629c41587f",
                "startTimestamp": 1705494060000,
                "endTimestamp": 1705496760000
                },
                {
                "customerId": 5481,
                "callId": "610f61bc-fe21-4084-86b7-ead6e091051b",
                "startTimestamp": 1705224180000,
                "endTimestamp": 1705225860000
                },
                {
                "customerId": 5481,
                "callId": "286c05a4-c7a9-4ba1-a9ae-528e9dfa439b",
                "startTimestamp": 1705047060000,
                "endTimestamp": 1705049760000
                },
                {
                "customerId": 34481,
                "callId": "2d0aae2d-6a11-4549-9018-7adadbe0cbdf",
                "startTimestamp": 1705051200000,
                "endTimestamp": 1705052880000
                },
                {
                "customerId": 66230,
                "callId": "49c5284b-2359-4df5-8094-ebeb01e00d47",
                "startTimestamp": 1705095120000,
                "endTimestamp": 1705098720000
                },
                {
                "customerId": 94631,
                "callId": "f83f9977-29bf-4263-afd6-62994bfaafe1",
                "startTimestamp": 1705354740000,
                "endTimestamp": 1705358340000
                },
                {
                "customerId": 20205,
                "callId": "672a6f3e-a315-47bd-a199-90d18bb57aad",
                "startTimestamp": 1705686960000,
                "endTimestamp": 1705689120000
                },
                {
                "customerId": 34481,
                "callId": "ad375864-7451-4edd-a03a-f065caa21f93",
                "startTimestamp": 1705268040000,
                "endTimestamp": 1705271640000
                },
                {
                "customerId": 34481,
                "callId": "9bce6f0f-5437-4e42-94ce-cddb3c8e3e24",
                "startTimestamp": 1704874020000,
                "endTimestamp": 1704876720000
                },
                {
                "customerId": 4950,
                "callId": "68c53bad-777d-47ef-8004-40441b5eaf92",
                "startTimestamp": 1705168260000,
                "endTimestamp": 1705170420000
                },
                {
                "customerId": 20205,
                "callId": "d97c6ee9-7e88-4b0b-923f-e01b51738ca6",
                "startTimestamp": 1705483620000,
                "endTimestamp": 1705485300000
                },
                {
                "customerId": 20205,
                "callId": "f1f61e93-c5c9-432d-b6cd-8a7ad2ac2d4a",
                "startTimestamp": 1705688040000,
                "endTimestamp": 1705693620000
                },
                {
                "customerId": 4950,
                "callId": "bdf7d434-6838-4136-bd8c-d75b0394e325",
                "startTimestamp": 1705181640000,
                "endTimestamp": 1705185240000
                },
                {
                "customerId": 94631,
                "callId": "945330f2-f329-4c7e-b0de-ad9af884b82a",
                "startTimestamp": 1705234260000,
                "endTimestamp": 1705235160000
                },
                {
                "customerId": 11106,
                "callId": "48fbe032-83ce-4a79-a540-04069a04948b",
                "startTimestamp": 1705601700000,
                "endTimestamp": 1705607280000
                },
                {
                "customerId": 4950,
                "callId": "7ac44d27-5de9-42d6-ad86-5e08ccbefb14",
                "startTimestamp": 1705061640000,
                "endTimestamp": 1705064340000
                },
                {
                "customerId": 74348,
                "callId": "e1b35ef0-7892-4694-9034-9405a830492c",
                "startTimestamp": 1705310520000,
                "endTimestamp": 1705312200000
                },
                {
                "customerId": 20205,
                "callId": "3bae690a-c9b0-4a13-b989-6fbbd59a44f7",
                "startTimestamp": 1705483560000,
                "endTimestamp": 1705485240000
                },
                {
                "customerId": 11106,
                "callId": "3418d934-7aac-4f32-8e8e-25456b01d858",
                "startTimestamp": 1705219800000,
                "endTimestamp": 1705222500000
                },
                {
                "customerId": 34481,
                "callId": "7426c72e-ab84-4919-9f58-07efb9306855",
                "startTimestamp": 1705051020000,
                "endTimestamp": 1705052700000
                },
                {
                "customerId": 20205,
                "callId": "c8087636-b4bd-4cae-87ed-4c9c62082916",
                "startTimestamp": 1705580040000,
                "endTimestamp": 1705580940000
                },
                {
                "customerId": 74348,
                "callId": "7b22cada-457a-43eb-a5d8-18b0a59fbf17",
                "startTimestamp": 1705514220000,
                "endTimestamp": 1705516380000
                },
                {
                "customerId": 94631,
                "callId": "3e8778c7-f99c-48ee-a054-b22680da86ce",
                "startTimestamp": 1705234500000,
                "endTimestamp": 1705237200000
                },
                {
                "customerId": 53596,
                "callId": "8672a69f-7d88-4c67-8db1-15988582fe8b",
                "startTimestamp": 1704996120000,
                "endTimestamp": 1705001700000
                },
                {
                "customerId": 34481,
                "callId": "71b8b531-5a70-42ad-8303-8d660184faa1",
                "startTimestamp": 1705148040000,
                "endTimestamp": 1705150740000
                },
                {
                "customerId": 11106,
                "callId": "cfa098f6-7879-46b0-b296-adde4a55b7b7",
                "startTimestamp": 1705601520000,
                "endTimestamp": 1705607100000
                },
                {
                "customerId": 34481,
                "callId": "a600a04e-b383-481f-92f2-e539f2d80d76",
                "startTimestamp": 1705051140000,
                "endTimestamp": 1705052820000
                },
                {
                "customerId": 4950,
                "callId": "7b5ba13f-5e6a-4c92-a4c0-6d8b94a93771",
                "startTimestamp": 1705169220000,
                "endTimestamp": 1705174800000
                },
                {
                "customerId": 74348,
                "callId": "fdf2083c-fc7d-41e9-8e89-947870fa50c5",
                "startTimestamp": 1705527780000,
                "endTimestamp": 1705531380000
                },
                {
                "customerId": 11106,
                "callId": "9fe0eea3-cbee-48cf-bd48-2b123d4e3ad3",
                "startTimestamp": 1705614360000,
                "endTimestamp": 1705617960000
                },
                {
                "customerId": 34481,
                "callId": "eff237a7-82de-4305-9a32-2d77f923d300",
                "startTimestamp": 1704873840000,
                "endTimestamp": 1704876540000
                },
                {
                "customerId": 11106,
                "callId": "dcf29ad5-939b-49a7-977e-31c8a1d24435",
                "startTimestamp": 1705494240000,
                "endTimestamp": 1705496940000
                },
                {
                "customerId": 62060,
                "callId": "adec5da5-b6d1-4361-a810-d0cd8f0cb72b",
                "startTimestamp": 1704909660000,
                "endTimestamp": 1704915240000
                },
                {
                "customerId": 5481,
                "callId": "4f72187b-ad27-454f-88f3-9aea06bf8d5a",
                "startTimestamp": 1705320480000,
                "endTimestamp": 1705321380000
                },
                {
                "customerId": 20205,
                "callId": "d5e74948-f3b4-45da-9e74-22567401e778",
                "startTimestamp": 1705687260000,
                "endTimestamp": 1705689420000
                },
                {
                "customerId": 66230,
                "callId": "c5758876-0823-44b2-a3ee-79bac4dd99ed",
                "startTimestamp": 1704878220000,
                "endTimestamp": 1704879900000
                },
                {
                "customerId": 74348,
                "callId": "2f5ab5f9-b799-4484-ac64-0b36a98b20fd",
                "startTimestamp": 1705310760000,
                "endTimestamp": 1705312440000
                },
                {
                "customerId": 53596,
                "callId": "bad8183b-b936-4c6d-9e07-e29afeaacee7",
                "startTimestamp": 1704995160000,
                "endTimestamp": 1704997320000
                },
                {
                "customerId": 94631,
                "callId": "9a44764f-f169-48ce-bad1-411c95596082",
                "startTimestamp": 1705234620000,
                "endTimestamp": 1705237320000
                },
                {
                "customerId": 11106,
                "callId": "a2d61c05-8893-48ad-8c76-bf2e1d09640e",
                "startTimestamp": 1705600620000,
                "endTimestamp": 1705602780000
                },
                {
                "customerId": 11106,
                "callId": "38c75ade-75fe-4b20-b01c-b2ff9eccc325",
                "startTimestamp": 1705494000000,
                "endTimestamp": 1705496700000
                },
                {
                "customerId": 5481,
                "callId": "53905194-14b9-4b0f-a3c7-322564b4fcc8",
                "startTimestamp": 1705321320000,
                "endTimestamp": 1705324020000
                },
                {
                "customerId": 74348,
                "callId": "8c7f05f8-a48e-40e8-abf5-19001dd2731a",
                "startTimestamp": 1705407000000,
                "endTimestamp": 1705407900000
                },
                {
                "customerId": 94631,
                "callId": "88efd6cd-2ce7-473b-a56c-ab5cbebdbed6",
                "startTimestamp": 1705341060000,
                "endTimestamp": 1705343220000
                },
                {
                "customerId": 20205,
                "callId": "ff4c3e82-8242-493e-861d-6129d5e04d57",
                "startTimestamp": 1705687320000,
                "endTimestamp": 1705689480000
                },
                {
                "customerId": 66230,
                "callId": "30f8ebbe-e383-40d6-98b5-7b7a430a0206",
                "startTimestamp": 1704700920000,
                "endTimestamp": 1704703620000
                },
                {
                "customerId": 34481,
                "callId": "30fe5a3f-13c1-4889-aca7-d4519dce4ad0",
                "startTimestamp": 1705058040000,
                "endTimestamp": 1705064700000
                },
                {
                "customerId": 74348,
                "callId": "42698c4f-6ce3-4330-a098-2c72391ab4d6",
                "startTimestamp": 1705527600000,
                "endTimestamp": 1705531200000
                },
                {
                "customerId": 94631,
                "callId": "209178ad-80e6-413c-a479-ae5b512131da",
                "startTimestamp": 1705341180000,
                "endTimestamp": 1705343340000
                },
                {
                "customerId": 34481,
                "callId": "f836a05e-b9c0-459b-9972-8c202cc8f6df",
                "startTimestamp": 1705255500000,
                "endTimestamp": 1705261080000
                },
                {
                "customerId": 34481,
                "callId": "5c21a8c6-4a56-4d24-9a3f-00dd945a1c28",
                "startTimestamp": 1705254660000,
                "endTimestamp": 1705256820000
                },
                {
                "customerId": 74348,
                "callId": "faf04aa3-83f2-43af-bbba-a5ba6b042687",
                "startTimestamp": 1705317420000,
                "endTimestamp": 1705324080000
                },
                {
                "customerId": 74348,
                "callId": "ca12dea5-4eb9-4692-a775-08085869f1f3",
                "startTimestamp": 1705407300000,
                "endTimestamp": 1705408200000
                },
                {
                "customerId": 74348,
                "callId": "976fc7a3-e1a6-4873-b5cb-aca8e36f9e04",
                "startTimestamp": 1705317480000,
                "endTimestamp": 1705324140000
                },
                {
                "customerId": 20205,
                "callId": "f34084e5-3a22-489c-a4ba-a02bb1abc130",
                "startTimestamp": 1705687860000,
                "endTimestamp": 1705693440000
                },
                {
                "customerId": 11106,
                "callId": "83b4befd-4385-4d6d-8ce7-b75fddd2e386",
                "startTimestamp": 1705404000000,
                "endTimestamp": 1705410660000
                },
                {
                "customerId": 11106,
                "callId": "e92dd000-b2d6-43e5-8c6d-681222c7e04f",
                "startTimestamp": 1705404360000,
                "endTimestamp": 1705411020000
                },
                {
                "customerId": 66230,
                "callId": "cfb443b2-b106-4f3b-bdcb-c5463721ed42",
                "startTimestamp": 1705095240000,
                "endTimestamp": 1705098840000
                },
                {
                "customerId": 34481,
                "callId": "66484202-72f3-4054-9bd8-e4f82d01d47e",
                "startTimestamp": 1705147560000,
                "endTimestamp": 1705148460000
                },
                {
                "customerId": 20205,
                "callId": "1077fb27-acb0-40c8-b4ef-260971727898",
                "startTimestamp": 1705483860000,
                "endTimestamp": 1705485540000
                },
                {
                "customerId": 5481,
                "callId": "80c706d6-4e80-4a5e-b591-34ccdb6fa6c7",
                "startTimestamp": 1705223940000,
                "endTimestamp": 1705225620000
                },
                {
                "customerId": 20205,
                "callId": "76cafcca-0b1b-42d6-b9ce-e9731d4576a1",
                "startTimestamp": 1705306680000,
                "endTimestamp": 1705309380000
                },
                {
                "customerId": 11106,
                "callId": "a3938394-33ae-4500-b275-cec0d2ae57e1",
                "startTimestamp": 1705404120000,
                "endTimestamp": 1705410780000
                },
                {
                "customerId": 11106,
                "callId": "7fe9f6d1-5519-455f-9032-923e2e906a02",
                "startTimestamp": 1705404300000,
                "endTimestamp": 1705410960000
                },
                {
                "customerId": 20205,
                "callId": "5ba5d7cd-59b3-4ba5-a62e-37b7033d2f22",
                "startTimestamp": 1705700760000,
                "endTimestamp": 1705704360000
                },
                {
                "customerId": 5481,
                "callId": "a694d1b7-bbee-4e2f-9979-4112f07d9e16",
                "startTimestamp": 1705428600000,
                "endTimestamp": 1705434180000
                },
                {
                "customerId": 75699,
                "callId": "77bc1385-b0c2-4ff6-bb97-f30c20ca595b",
                "startTimestamp": 1705403580000,
                "endTimestamp": 1705415460000
                },
                {
                "customerId": 11106,
                "callId": "f47b4a83-d1e6-4b0d-b715-eadf2c5ff48f",
                "startTimestamp": 1705219920000,
                "endTimestamp": 1705222620000
                },
                {
                "customerId": 5481,
                "callId": "446f6806-602a-42ab-a2df-e3e11e7b8c1d",
                "startTimestamp": 1705427460000,
                "endTimestamp": 1705429620000
                },
                {
                "customerId": 11106,
                "callId": "1bd9f2fc-efc3-4f52-820e-04289399de80",
                "startTimestamp": 1705600380000,
                "endTimestamp": 1705602540000
                },
                {
                "customerId": 20205,
                "callId": "ef20d793-61a1-4f22-998e-97559e5d9374",
                "startTimestamp": 1705580760000,
                "endTimestamp": 1705583460000
                },
                {
                "customerId": 66230,
                "callId": "b3a4057b-d9cd-4aa7-ab29-394dd79559d8",
                "startTimestamp": 1704700980000,
                "endTimestamp": 1704703680000
                },
                {
                "customerId": 4950,
                "callId": "00019787-3755-48d8-9af7-87ebe63140eb",
                "startTimestamp": 1704964560000,
                "endTimestamp": 1704966240000
                },
                {
                "customerId": 20205,
                "callId": "856658c4-3b53-4406-b233-739cc9febf68",
                "startTimestamp": 1705483680000,
                "endTimestamp": 1705485360000
                },
                {
                "customerId": 20205,
                "callId": "3719cca4-80f5-4a4b-9991-8b21d91e0c25",
                "startTimestamp": 1705580520000,
                "endTimestamp": 1705583220000
                },
                {
                "customerId": 5481,
                "callId": "79d45481-b564-41f7-99ab-c08e7055576e",
                "startTimestamp": 1705231140000,
                "endTimestamp": 1705237800000
                },
                {
                "customerId": 11106,
                "callId": "bd0e74df-e21e-4c00-845e-d012b86d1fd4",
                "startTimestamp": 1705614240000,
                "endTimestamp": 1705617840000
                },
                {
                "customerId": 11106,
                "callId": "6fcbf87b-c613-4534-854b-016a886f975e",
                "startTimestamp": 1705396980000,
                "endTimestamp": 1705398660000
                },
                {
                "customerId": 11106,
                "callId": "55d15505-d82a-4b25-9822-dd5a955f2e8c",
                "startTimestamp": 1705494300000,
                "endTimestamp": 1705497000000
                },
                {
                "customerId": 11106,
                "callId": "eb9a3efe-dbad-4539-9dd1-176938c9a01d",
                "startTimestamp": 1705396920000,
                "endTimestamp": 1705398600000
                },
                {
                "customerId": 94631,
                "callId": "e648cff5-7208-41f8-9464-e7e77cc36ecd",
                "startTimestamp": 1704960600000,
                "endTimestamp": 1704963300000
                },
                {
                "customerId": 20205,
                "callId": "d5fb0ace-5b5f-44c7-8791-e66e6b76b84e",
                "startTimestamp": 1705687980000,
                "endTimestamp": 1705693560000
                },
                {
                "customerId": 20205,
                "callId": "28541101-2e58-4563-8573-7f5123d977c2",
                "startTimestamp": 1705483500000,
                "endTimestamp": 1705485180000
                },
                {
                "customerId": 11106,
                "callId": "65dacb90-de17-4636-9cfa-e87468622066",
                "startTimestamp": 1705614300000,
                "endTimestamp": 1705617900000
                },
                {
                "customerId": 53596,
                "callId": "467d0f90-71d7-4edf-8221-47d7dd29339f",
                "startTimestamp": 1705008720000,
                "endTimestamp": 1705012320000
                },
                {
                "customerId": 11106,
                "callId": "834a4ff0-3b07-44ff-9671-7cf42c14e3f3",
                "startTimestamp": 1705493880000,
                "endTimestamp": 1705496580000
                },
                {
                "customerId": 75699,
                "callId": "42794d27-3919-4bf4-8b5f-98e7c61b4113",
                "startTimestamp": 1704928200000,
                "endTimestamp": 1705109640000
                },
                {
                "customerId": 94631,
                "callId": "1d2756c1-8c74-4f41-a75f-2b2fe71b0f45",
                "startTimestamp": 1705341960000,
                "endTimestamp": 1705347540000
                },
                {
                "customerId": 53596,
                "callId": "1211d935-7f31-40aa-ae06-ebf0ff0f3b19",
                "startTimestamp": 1704791640000,
                "endTimestamp": 1704793320000
                },
                {
                "customerId": 94631,
                "callId": "3f77e522-fc41-4d6e-b479-21a83c9222bd",
                "startTimestamp": 1705342140000,
                "endTimestamp": 1705347720000
                },
                {
                "customerId": 94631,
                "callId": "f71d64bd-7f77-4ea5-9fb7-8349214726c8",
                "startTimestamp": 1705354620000,
                "endTimestamp": 1705358220000
                },
                {
                "customerId": 66230,
                "callId": "c4ee2b9d-0e0b-467a-8b99-fc518e0342c7",
                "startTimestamp": 1705082580000,
                "endTimestamp": 1705088160000
                },
                {
                "customerId": 94631,
                "callId": "d81abf6c-3dde-4bdf-911b-22601b7bdf71",
                "startTimestamp": 1705137660000,
                "endTimestamp": 1705139340000
                },
                {
                "customerId": 5481,
                "callId": "e12799f6-b376-4c21-9b43-eb3ec5c18b25",
                "startTimestamp": 1705427520000,
                "endTimestamp": 1705429680000
                },
                {
                "customerId": 20205,
                "callId": "2fefd5ee-9f90-421a-82f3-c0a5afe225ee",
                "startTimestamp": 1705490400000,
                "endTimestamp": 1705497060000
                },
                {
                "customerId": 62060,
                "callId": "17367aaa-9d10-4d17-959d-4fdfaafe67ea",
                "startTimestamp": 1704705180000,
                "endTimestamp": 1704706860000
                },
                {
                "customerId": 4950,
                "callId": "f1eab2d3-5582-4611-be05-b6f924c43745",
                "startTimestamp": 1705169100000,
                "endTimestamp": 1705174680000
                },
                {
                "customerId": 11106,
                "callId": "ecc1956e-59c9-4cfa-82e5-6dd47a9a62fe",
                "startTimestamp": 1705396860000,
                "endTimestamp": 1705398540000
                },
                {
                "customerId": 94631,
                "callId": "70cc595c-3d8f-4655-8f3b-a6d98a9b48c8",
                "startTimestamp": 1705137780000,
                "endTimestamp": 1705139460000
                },
                {
                "customerId": 66230,
                "callId": "d54c3885-3c49-4743-a7ee-9b2c1bfae34f",
                "startTimestamp": 1704974700000,
                "endTimestamp": 1704975600000
                },
                {
                "customerId": 74348,
                "callId": "1278dde2-4d15-4bfd-a0a8-3284443b332b",
                "startTimestamp": 1705407120000,
                "endTimestamp": 1705408020000
                },
                {
                "customerId": 75699,
                "callId": "3c55cb1c-8ed1-43c3-85d2-6151e9e9bb6a",
                "startTimestamp": 1705240500000,
                "endTimestamp": 1705241520000
                },
                {
                "customerId": 74348,
                "callId": "e830b2ef-245a-40e2-9de9-05b46ba06bf8",
                "startTimestamp": 1705133220000,
                "endTimestamp": 1705135920000
                },
                {
                "customerId": 5481,
                "callId": "f89b7225-a81a-4af5-be49-a596b8033785",
                "startTimestamp": 1705321080000,
                "endTimestamp": 1705323780000
                },
                {
                "customerId": 34481,
                "callId": "fe7bd538-1338-40e0-91c5-97c6953d2552",
                "startTimestamp": 1705268100000,
                "endTimestamp": 1705271700000
                }
                ]
                }
                """;
    }
}
