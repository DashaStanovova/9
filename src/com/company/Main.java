input A
input B
input C
if (A<B) AND (B<C) then
        output A
        output B
        output C
end if
if (A<C) AND (C<B) then
        output A
        output C
        output B
end if
if (B<A) AND (A<C) then
        output B
        output A
        output C
end if
if (B<C) AND (C<A) then
        output B
        output C
        output A
end if
if (C<A) AND (A<B) then
        output C
        output A
        output B
end if
if (C<B) AND (B<A) then
        output C
        output B
        output A
end if
