select fr.name as fruit, vr.name as variety from fruit fr join variety vr on fr.id = vr.fruit_id;

select pr.name as parcel, pr.number_of_trees, fr.name as fruit, vr.name as variety from parcel pr join fruit fr on pr.id = fr.id join variety vr on fr.id = vr.fruit_id;