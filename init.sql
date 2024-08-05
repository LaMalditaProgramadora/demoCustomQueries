INSERT INTO public.owner(
	id, email, first_name, last_name, phone)
	VALUES (1, 'juanatorres@gmail.com', 'Juana', 'Torres', '965236520');
INSERT INTO public.owner(
	id, email, first_name, last_name, phone)
	VALUES (2, 'eduardohuertas@gmail.com', 'Eduardo', 'Huertas', '951245522');
INSERT INTO public.owner(
	id, email, first_name, last_name, phone)
	VALUES (3, 'omarparra@gmail.com', 'Omar', 'Parra', '980206369');
INSERT INTO public.owner(
	id, email, first_name, last_name, phone)
	VALUES (4, 'ariannarojas@gmail.com', 'Arianna', 'Rojas', '993096784');
INSERT INTO public.owner(
	id, email, first_name, last_name, phone)
	VALUES (5, 'marydelcarpio@gmail.com', 'Mary', 'Del Carpio', '923630741');

INSERT INTO public.specie(
	id, name)
	VALUES (1, 'Perro');
INSERT INTO public.specie(
	id, name)
	VALUES (2, 'Gato');

INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (1, '2023-02-01', 'Terreneitor', 1);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (2, '2023-02-01', 'Lucy', 1);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (3, '2023-08-15', 'Batman', 2);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (4, '2020-11-05', 'Barbie', 1);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (5, '2021-06-06', 'Ezequiel', 2);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (6, '2024-01-29', 'Yoda', 1);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (7, '2022-07-16', 'Thor', 1);
INSERT INTO public.pet(
	id, birthday, name, specie_id)
	VALUES (8, '2021-12-03', 'Cleo', 2);

INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (1, 1, 1);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (2, 2, 1);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (3, 3, 2);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (4, 4, 3);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (5, 5, 3);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (6, 6, 4);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (7, 7, 4);
INSERT INTO public.owner_pet(
	id, pet_id, owner_id)
	VALUES (8, 8, 5);