# BSON, MongoDB, fsync
### BSON
#### What are the main distinctions between BSON documents in MongoDB and JSON documents in general?

 - Both JSON and BSON are Javascript Object Notation, however, BSON is in the non-human-readable format of binary while
JSON is in plaintext human-readable format
 - In MongoDB - BSON is used to encrypt the incoming JSON files due to its binary formatting
 - Data in MongoDB is stored as BSON
 - BSON contains a few additional data types such as date, timestamp, etc
 - You must parse over every byte in a JSON while in BSON you can skip over content not in use

### MongoDB
#### What factors should be considered while constructing a schema in MongoDB?

- Create the schema in accordance with the needs of the users
- If you use several objects together, combine them into a single document. Separate them if necessary
- Do joins while writing, not while reading
- Optimize the schema with the most common use cases
- Perform complex aggregation in the schema

### fsync
#### Does an update fsync to the disk immediately? Explain.

No because disk writing in Mongo is lazy by default. A write may only write to disk a couple of seconds later